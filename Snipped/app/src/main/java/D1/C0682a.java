package d1;

/* compiled from: SimpleSQLiteQuery.kt */
/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f20402a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f20403b;

    /* compiled from: SimpleSQLiteQuery.kt */
    /* renamed from: d1.a$a, reason: collision with other inner class name */
    public static final class C0390a {
        public static void a(e eVar, Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    eVar.bindNull(i);
                } else if (obj instanceof byte[]) {
                    eVar.bindBlob(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    eVar.bindDouble(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    eVar.bindDouble(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    eVar.bindLong(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    eVar.bindLong(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    eVar.bindLong(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    eVar.bindLong(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    eVar.bindString(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    eVar.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    public C0682a(String str, Object[] objArr) {
        this.f20402a = str;
        this.f20403b = objArr;
    }

    @Override // d1.f
    public final void bindTo(e eVar) {
        C0390a.a(eVar, this.f20403b);
    }

    @Override // d1.f
    public final int getArgCount() {
        Object[] objArr = this.f20403b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // d1.f
    public final String getSql() {
        return this.f20402a;
    }
}
