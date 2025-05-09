package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class ImageHeaderParserUtils {
    private static final int MARK_READ_LIMIT = 5242880;

    public interface OrientationReader {
        int getOrientationAndRewind(ImageHeaderParser imageHeaderParser);
    }

    public interface TypeReader {
        ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser);
    }

    private ImageHeaderParserUtils() {
    }

    public static int getOrientation(List<ImageHeaderParser> list, final ByteBuffer byteBuffer, final ArrayPool arrayPool) {
        if (byteBuffer == null) {
            return -1;
        }
        return getOrientationInternal(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.4
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) {
                try {
                    return imageHeaderParser.getOrientation(byteBuffer, arrayPool);
                } finally {
                    ByteBufferUtil.rewind(byteBuffer);
                }
            }
        });
    }

    private static int getOrientationInternal(List<ImageHeaderParser> list, OrientationReader orientationReader) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int orientationAndRewind = orientationReader.getOrientationAndRewind(list.get(i));
            if (orientationAndRewind != -1) {
                return orientationAndRewind;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType getType(List<ImageHeaderParser> list, final InputStream inputStream, ArrayPool arrayPool) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(MARK_READ_LIMIT);
        return getTypeInternal(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.1
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) {
                try {
                    return imageHeaderParser.getType(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    private static ImageHeaderParser.ImageType getTypeInternal(List<ImageHeaderParser> list, TypeReader typeReader) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType typeAndRewind = typeReader.getTypeAndRewind(list.get(i));
            if (typeAndRewind != ImageHeaderParser.ImageType.UNKNOWN) {
                return typeAndRewind;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int getOrientation(List<ImageHeaderParser> list, final InputStream inputStream, final ArrayPool arrayPool) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(MARK_READ_LIMIT);
        return getOrientationInternal(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.5
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) {
                try {
                    return imageHeaderParser.getOrientation(inputStream, arrayPool);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int getOrientation(List<ImageHeaderParser> list, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final ArrayPool arrayPool) {
        return getOrientationInternal(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.6
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(ParcelFileDescriptorRewinder.this.rewindAndGet().getFileDescriptor()), arrayPool);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    int orientation = imageHeaderParser.getOrientation(recyclableBufferedInputStream, arrayPool);
                    recyclableBufferedInputStream.release();
                    ParcelFileDescriptorRewinder.this.rewindAndGet();
                    return orientation;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        recyclableBufferedInputStream2.release();
                    }
                    ParcelFileDescriptorRewinder.this.rewindAndGet();
                    throw th;
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType getType(List<ImageHeaderParser> list, final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return getTypeInternal(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.2
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) {
                try {
                    return imageHeaderParser.getType(byteBuffer);
                } finally {
                    ByteBufferUtil.rewind(byteBuffer);
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType getType(List<ImageHeaderParser> list, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final ArrayPool arrayPool) {
        return getTypeInternal(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.3
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(ParcelFileDescriptorRewinder.this.rewindAndGet().getFileDescriptor()), arrayPool);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    ImageHeaderParser.ImageType type = imageHeaderParser.getType(recyclableBufferedInputStream);
                    recyclableBufferedInputStream.release();
                    ParcelFileDescriptorRewinder.this.rewindAndGet();
                    return type;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        recyclableBufferedInputStream2.release();
                    }
                    ParcelFileDescriptorRewinder.this.rewindAndGet();
                    throw th;
                }
            }
        });
    }
}
