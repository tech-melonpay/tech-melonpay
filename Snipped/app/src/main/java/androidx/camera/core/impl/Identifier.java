package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class Identifier {
    public static Identifier create(Object obj) {
        return new AutoValue_Identifier(obj);
    }

    public abstract Object getValue();
}
