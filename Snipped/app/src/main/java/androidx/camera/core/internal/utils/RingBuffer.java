package androidx.camera.core.internal.utils;

/* loaded from: classes.dex */
public interface RingBuffer<T> {

    public interface OnRemoveCallback<T> {
        void onRemove(T t3);
    }

    T dequeue();

    void enqueue(T t3);

    int getMaxCapacity();

    boolean isEmpty();
}
