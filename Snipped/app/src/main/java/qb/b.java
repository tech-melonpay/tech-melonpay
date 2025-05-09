package qb;

/* compiled from: Call.java */
/* loaded from: classes3.dex */
public interface b<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    b<T> mo75clone();

    void enqueue(d<T> dVar);

    q<T> execute();

    boolean isCanceled();

    okhttp3.k request();
}
