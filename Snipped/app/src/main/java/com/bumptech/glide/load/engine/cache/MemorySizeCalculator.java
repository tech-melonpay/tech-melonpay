package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class MemorySizeCalculator {
    static final int BYTES_PER_ARGB_8888_PIXEL = 4;
    private static final int LOW_MEMORY_BYTE_ARRAY_POOL_DIVISOR = 2;
    private static final String TAG = "MemorySizeCalculator";
    private final int arrayPoolSize;
    private final int bitmapPoolSize;
    private final Context context;
    private final int memoryCacheSize;

    public static final class Builder {
        static final int ARRAY_POOL_SIZE_BYTES = 4194304;
        static final int BITMAP_POOL_TARGET_SCREENS = 1;
        static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33f;
        static final float MAX_SIZE_MULTIPLIER = 0.4f;
        static final int MEMORY_CACHE_TARGET_SCREENS = 2;
        ActivityManager activityManager;
        float bitmapPoolScreens;
        final Context context;
        ScreenDimensions screenDimensions;
        float memoryCacheScreens = 2.0f;
        float maxSizeMultiplier = MAX_SIZE_MULTIPLIER;
        float lowMemoryMaxSizeMultiplier = LOW_MEMORY_MAX_SIZE_MULTIPLIER;
        int arrayPoolSizeBytes = 4194304;

        public Builder(Context context) {
            this.bitmapPoolScreens = BITMAP_POOL_TARGET_SCREENS;
            this.context = context;
            this.activityManager = (ActivityManager) context.getSystemService("activity");
            this.screenDimensions = new DisplayMetricsScreenDimensions(context.getResources().getDisplayMetrics());
            if (MemorySizeCalculator.isLowMemoryDevice(this.activityManager)) {
                this.bitmapPoolScreens = 0.0f;
            }
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        public Builder setActivityManager(ActivityManager activityManager) {
            this.activityManager = activityManager;
            return this;
        }

        public Builder setArrayPoolSize(int i) {
            this.arrayPoolSizeBytes = i;
            return this;
        }

        public Builder setBitmapPoolScreens(float f10) {
            Preconditions.checkArgument(f10 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.bitmapPoolScreens = f10;
            return this;
        }

        public Builder setLowMemoryMaxSizeMultiplier(float f10) {
            Preconditions.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.lowMemoryMaxSizeMultiplier = f10;
            return this;
        }

        public Builder setMaxSizeMultiplier(float f10) {
            Preconditions.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.maxSizeMultiplier = f10;
            return this;
        }

        public Builder setMemoryCacheScreens(float f10) {
            Preconditions.checkArgument(f10 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.memoryCacheScreens = f10;
            return this;
        }

        public Builder setScreenDimensions(ScreenDimensions screenDimensions) {
            this.screenDimensions = screenDimensions;
            return this;
        }
    }

    public static final class DisplayMetricsScreenDimensions implements ScreenDimensions {
        private final DisplayMetrics displayMetrics;

        public DisplayMetricsScreenDimensions(DisplayMetrics displayMetrics) {
            this.displayMetrics = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        public int getHeightPixels() {
            return this.displayMetrics.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        public int getWidthPixels() {
            return this.displayMetrics.widthPixels;
        }
    }

    public interface ScreenDimensions {
        int getHeightPixels();

        int getWidthPixels();
    }

    public MemorySizeCalculator(Builder builder) {
        this.context = builder.context;
        int i = isLowMemoryDevice(builder.activityManager) ? builder.arrayPoolSizeBytes / 2 : builder.arrayPoolSizeBytes;
        this.arrayPoolSize = i;
        int maxSize = getMaxSize(builder.activityManager, builder.maxSizeMultiplier, builder.lowMemoryMaxSizeMultiplier);
        float widthPixels = builder.screenDimensions.getWidthPixels() * builder.screenDimensions.getHeightPixels() * 4;
        int round = Math.round(builder.bitmapPoolScreens * widthPixels);
        int round2 = Math.round(widthPixels * builder.memoryCacheScreens);
        int i9 = maxSize - i;
        int i10 = round2 + round;
        if (i10 <= i9) {
            this.memoryCacheSize = round2;
            this.bitmapPoolSize = round;
        } else {
            float f10 = i9;
            float f11 = builder.bitmapPoolScreens;
            float f12 = builder.memoryCacheScreens;
            float f13 = f10 / (f11 + f12);
            this.memoryCacheSize = Math.round(f12 * f13);
            this.bitmapPoolSize = Math.round(f13 * builder.bitmapPoolScreens);
        }
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(toMb(this.memoryCacheSize));
            sb2.append(", pool size: ");
            sb2.append(toMb(this.bitmapPoolSize));
            sb2.append(", byte array size: ");
            sb2.append(toMb(i));
            sb2.append(", memory class limited? ");
            sb2.append(i10 > maxSize);
            sb2.append(", max size: ");
            sb2.append(toMb(maxSize));
            sb2.append(", memoryClass: ");
            sb2.append(builder.activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(isLowMemoryDevice(builder.activityManager));
            Log.d(TAG, sb2.toString());
        }
    }

    private static int getMaxSize(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * PKIFailureInfo.badCertTemplate;
        if (isLowMemoryDevice(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    public static boolean isLowMemoryDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String toMb(int i) {
        return Formatter.formatFileSize(this.context, i);
    }

    public int getArrayPoolSizeInBytes() {
        return this.arrayPoolSize;
    }

    public int getBitmapPoolSize() {
        return this.bitmapPoolSize;
    }

    public int getMemoryCacheSize() {
        return this.memoryCacheSize;
    }
}
