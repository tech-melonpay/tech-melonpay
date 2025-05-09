package kotlin.text;

/* compiled from: Regex.kt */
/* loaded from: classes2.dex */
public enum RegexOption {
    IGNORE_CASE(2),
    MULTILINE(8),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128);


    /* renamed from: a, reason: collision with root package name */
    public final int f23207a;

    RegexOption() {
        throw null;
    }

    RegexOption(int i) {
        this.f23207a = i;
    }
}
