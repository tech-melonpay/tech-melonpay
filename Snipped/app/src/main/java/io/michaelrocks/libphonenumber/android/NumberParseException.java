package io.michaelrocks.libphonenumber.android;

/* loaded from: classes2.dex */
public class NumberParseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorType f21535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21536b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorType f21537a;

        /* renamed from: b, reason: collision with root package name */
        public static final ErrorType f21538b;

        /* renamed from: c, reason: collision with root package name */
        public static final ErrorType f21539c;

        /* renamed from: d, reason: collision with root package name */
        public static final ErrorType f21540d;

        /* renamed from: e, reason: collision with root package name */
        public static final ErrorType f21541e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ErrorType[] f21542f;

        static {
            ErrorType errorType = new ErrorType("INVALID_COUNTRY_CODE", 0);
            f21537a = errorType;
            ErrorType errorType2 = new ErrorType("NOT_A_NUMBER", 1);
            f21538b = errorType2;
            ErrorType errorType3 = new ErrorType("TOO_SHORT_AFTER_IDD", 2);
            f21539c = errorType3;
            ErrorType errorType4 = new ErrorType("TOO_SHORT_NSN", 3);
            f21540d = errorType4;
            ErrorType errorType5 = new ErrorType("TOO_LONG", 4);
            f21541e = errorType5;
            f21542f = new ErrorType[]{errorType, errorType2, errorType3, errorType4, errorType5};
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f21542f.clone();
        }
    }

    public NumberParseException(ErrorType errorType, String str) {
        super(str);
        this.f21536b = str;
        this.f21535a = errorType;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.f21535a + ". " + this.f21536b;
    }
}
