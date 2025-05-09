package kotlin.jvm.internal;

import ia.InterfaceC0834b;
import ia.InterfaceC0836d;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

/* loaded from: classes2.dex */
public abstract class CallableReference implements InterfaceC0834b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f23174a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC0834b reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final NoReceiver f23174a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return f23174a;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // ia.InterfaceC0834b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ia.InterfaceC0834b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC0834b compute() {
        InterfaceC0834b interfaceC0834b = this.reflected;
        if (interfaceC0834b != null) {
            return interfaceC0834b;
        }
        InterfaceC0834b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC0834b computeReflected();

    @Override // ia.InterfaceC0833a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC0836d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return h.a(cls);
        }
        h.f23186a.getClass();
        return new g(cls);
    }

    @Override // ia.InterfaceC0834b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC0834b getReflected() {
        InterfaceC0834b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // ia.InterfaceC0834b
    public ia.k getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ia.InterfaceC0834b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ia.InterfaceC0834b
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ia.InterfaceC0834b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ia.InterfaceC0834b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ia.InterfaceC0834b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // ia.InterfaceC0834b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
