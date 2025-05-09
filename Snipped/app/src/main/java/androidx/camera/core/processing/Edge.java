package androidx.camera.core.processing;

import x0.InterfaceC1579a;

/* loaded from: classes.dex */
public class Edge<T> implements InterfaceC1579a<T> {
    private InterfaceC1579a<T> mListener;

    @Override // x0.InterfaceC1579a
    public void accept(T t3) {
        this.mListener.accept(t3);
    }

    public void setListener(InterfaceC1579a<T> interfaceC1579a) {
        this.mListener = interfaceC1579a;
    }
}
