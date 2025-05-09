package kotlin.jvm.internal;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes2.dex */
public final class i {
    public static String a(e eVar) {
        String obj = eVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
