package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.C0559z;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0913a;
import y0.C1596C;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f5807l = 0;

    /* renamed from: a, reason: collision with root package name */
    public ImplementationMode f5808a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.camera.view.c f5809b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.view.b f5810c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5811d;

    /* renamed from: e, reason: collision with root package name */
    public final C0559z<StreamState> f5812e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<androidx.camera.view.a> f5813f;

    /* renamed from: g, reason: collision with root package name */
    public final M.d f5814g;

    /* renamed from: h, reason: collision with root package name */
    public CameraInfoInternal f5815h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final B2.c f5816j;

    /* renamed from: k, reason: collision with root package name */
    public final a f5817k;

    public enum ImplementationMode {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);


        /* renamed from: a, reason: collision with root package name */
        public final int f5820a;

        ImplementationMode(int i) {
            this.f5820a = i;
        }
    }

    public enum ScaleType {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* renamed from: a, reason: collision with root package name */
        public final int f5826a;

        ScaleType(int i) {
            this.f5826a = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StreamState {

        /* renamed from: a, reason: collision with root package name */
        public static final StreamState f5827a;

        /* renamed from: b, reason: collision with root package name */
        public static final StreamState f5828b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ StreamState[] f5829c;

        static {
            StreamState streamState = new StreamState("IDLE", 0);
            f5827a = streamState;
            StreamState streamState2 = new StreamState("STREAMING", 1);
            f5828b = streamState2;
            f5829c = new StreamState[]{streamState, streamState2};
        }

        public StreamState() {
            throw null;
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) f5829c.clone();
        }
    }

    public class a implements Preview.SurfaceProvider {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.Preview.SurfaceProvider
        public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
            d dVar;
            boolean isMainThread = Threads.isMainThread();
            PreviewView previewView = PreviewView.this;
            if (!isMainThread) {
                C0913a.getMainExecutor(previewView.getContext()).execute(new B6.d(21, this, surfaceRequest));
                return;
            }
            Logger.d("PreviewView", "Surface requested by Preview.");
            CameraInternal camera = surfaceRequest.getCamera();
            previewView.f5815h = camera.getCameraInfoInternal();
            surfaceRequest.setTransformationInfoListener(C0913a.getMainExecutor(previewView.getContext()), new M.b(this, camera, surfaceRequest, 1));
            androidx.camera.view.c cVar = previewView.f5809b;
            ImplementationMode implementationMode = previewView.f5808a;
            if (!(cVar instanceof d) || PreviewView.b(surfaceRequest, implementationMode)) {
                boolean b9 = PreviewView.b(surfaceRequest, previewView.f5808a);
                androidx.camera.view.b bVar = previewView.f5810c;
                if (b9) {
                    e eVar = new e(previewView, bVar);
                    eVar.i = false;
                    eVar.f5866k = new AtomicReference<>();
                    dVar = eVar;
                } else {
                    dVar = new d(previewView, bVar);
                }
                previewView.f5809b = dVar;
            }
            androidx.camera.view.a aVar = new androidx.camera.view.a(camera.getCameraInfoInternal(), previewView.f5812e, previewView.f5809b);
            previewView.f5813f.set(aVar);
            camera.getCameraState().addObserver(C0913a.getMainExecutor(previewView.getContext()), aVar);
            previewView.f5809b.e(surfaceRequest, new M.b(this, aVar, camera));
        }
    }

    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f5808a = ImplementationMode.PERFORMANCE;
        androidx.camera.view.b bVar = new androidx.camera.view.b();
        bVar.f5846h = ScaleType.FILL_CENTER;
        this.f5810c = bVar;
        this.f5811d = true;
        this.f5812e = new C0559z<>(StreamState.f5827a);
        this.f5813f = new AtomicReference<>();
        this.f5814g = new M.d(bVar);
        this.i = new b();
        this.f5816j = new B2.c(this, 1);
        this.f5817k = new a();
        Threads.checkMainThread();
        Resources.Theme theme = context.getTheme();
        int[] iArr = M.e.f2510a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C1596C.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(1, bVar.f5846h.f5826a);
            for (ScaleType scaleType : ScaleType.values()) {
                if (scaleType.f5826a == integer) {
                    setScaleType(scaleType);
                    int integer2 = obtainStyledAttributes.getInteger(0, 0);
                    for (ImplementationMode implementationMode : ImplementationMode.values()) {
                        if (implementationMode.f5820a == integer2) {
                            setImplementationMode(implementationMode);
                            obtainStyledAttributes.recycle();
                            new ScaleGestureDetector(context, new c());
                            if (getBackground() == null) {
                                setBackgroundColor(C0913a.getColor(getContext(), R.color.black));
                                return;
                            }
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean equals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals(CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        Quirks quirks = N.a.f2737a;
        boolean z10 = (quirks.get(N.c.class) == null && quirks.get(N.b.class) == null) ? false : true;
        if (equals || z10) {
            return true;
        }
        int ordinal = implementationMode.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    public final void a() {
        Display display;
        CameraInfoInternal cameraInfoInternal;
        Threads.checkMainThread();
        if (this.f5809b != null) {
            if (this.f5811d && (display = getDisplay()) != null && (cameraInfoInternal = this.f5815h) != null) {
                int sensorRotationDegrees = cameraInfoInternal.getSensorRotationDegrees(display.getRotation());
                int rotation = display.getRotation();
                androidx.camera.view.b bVar = this.f5810c;
                if (bVar.f5845g) {
                    bVar.f5841c = sensorRotationDegrees;
                    bVar.f5843e = rotation;
                }
            }
            this.f5809b.f();
        }
        M.d dVar = this.f5814g;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        dVar.getClass();
        Threads.checkMainThread();
        synchronized (dVar) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    dVar.f2509b = dVar.f2508a.a(size, layoutDirection);
                    return;
                }
                dVar.f2509b = null;
            } finally {
            }
        }
    }

    public Bitmap getBitmap() {
        Bitmap b9;
        Threads.checkMainThread();
        androidx.camera.view.c cVar = this.f5809b;
        if (cVar == null || (b9 = cVar.b()) == null) {
            return null;
        }
        FrameLayout frameLayout = cVar.f5848b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        androidx.camera.view.b bVar = cVar.f5849c;
        if (!bVar.f()) {
            return b9;
        }
        Matrix d10 = bVar.d();
        RectF e10 = bVar.e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b9.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d10);
        matrix.postScale(e10.width() / bVar.f5839a.getWidth(), e10.height() / bVar.f5839a.getHeight());
        matrix.postTranslate(e10.left, e10.top);
        canvas.drawBitmap(b9, matrix, new Paint(7));
        return createBitmap;
    }

    public M.a getController() {
        Threads.checkMainThread();
        return null;
    }

    public ImplementationMode getImplementationMode() {
        Threads.checkMainThread();
        return this.f5808a;
    }

    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.f5814g;
    }

    public O.a getOutputTransform() {
        Matrix matrix;
        androidx.camera.view.b bVar = this.f5810c;
        Threads.checkMainThread();
        try {
            matrix = bVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = bVar.f5840b;
        if (matrix == null || rect == null) {
            Logger.d("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(TransformUtils.getNormalizedToBuffer(rect));
        if (this.f5809b instanceof e) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            Logger.w("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new O.a();
    }

    public AbstractC0557x<StreamState> getPreviewStreamState() {
        return this.f5812e;
    }

    public ScaleType getScaleType() {
        Threads.checkMainThread();
        return this.f5810c.f5846h;
    }

    public Matrix getSensorToViewTransform() {
        Threads.checkMainThread();
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        androidx.camera.view.b bVar = this.f5810c;
        if (!bVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(bVar.f5842d);
        matrix.postConcat(bVar.c(size, layoutDirection));
        return matrix;
    }

    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.f5817k;
    }

    public ViewPort getViewPort() {
        Threads.checkMainThread();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort.Builder(new Rational(getWidth(), getHeight()), rotation).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.i, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f5816j);
        androidx.camera.view.c cVar = this.f5809b;
        if (cVar != null) {
            cVar.c();
        }
        Threads.checkMainThread();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f5816j);
        androidx.camera.view.c cVar = this.f5809b;
        if (cVar != null) {
            cVar.d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public void setController(M.a aVar) {
        Threads.checkMainThread();
        Threads.checkMainThread();
        getViewPort();
    }

    public void setImplementationMode(ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.f5808a = implementationMode;
    }

    public void setScaleType(ScaleType scaleType) {
        Threads.checkMainThread();
        this.f5810c.f5846h = scaleType;
        a();
        Threads.checkMainThread();
        getViewPort();
    }

    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            PreviewView previewView = PreviewView.this;
            Display display = previewView.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            previewView.a();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
