package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0661h;
import com.google.crypto.tink.shaded.protobuf.C0658e;
import com.google.crypto.tink.shaded.protobuf.C0670q;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0654a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected e0 unknownFields = e0.f10210f;
    protected int memoizedSerializedSize = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {

        /* renamed from: a, reason: collision with root package name */
        public static final MethodToInvoke f10108a;

        /* renamed from: b, reason: collision with root package name */
        public static final MethodToInvoke f10109b;

        /* renamed from: c, reason: collision with root package name */
        public static final MethodToInvoke f10110c;

        /* renamed from: d, reason: collision with root package name */
        public static final MethodToInvoke f10111d;

        /* renamed from: e, reason: collision with root package name */
        public static final MethodToInvoke f10112e;

        /* renamed from: f, reason: collision with root package name */
        public static final MethodToInvoke f10113f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ MethodToInvoke[] f10114g;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            f10108a = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            f10109b = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            f10110c = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            f10111d = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            f10112e = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            f10113f = methodToInvoke6;
            f10114g = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, new MethodToInvoke("GET_PARSER", 6)};
        }

        public MethodToInvoke() {
            throw null;
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) f10114g.clone();
        }
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0654a.AbstractC0109a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageType f10115a;

        /* renamed from: b, reason: collision with root package name */
        public MessageType f10116b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10117c = false;

        public a(MessageType messagetype) {
            this.f10115a = messagetype;
            this.f10116b = (MessageType) messagetype.k(MethodToInvoke.f10111d);
        }

        public static void j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            T t3 = T.f10158c;
            t3.getClass();
            t3.a(generatedMessageLite.getClass()).a(generatedMessageLite, generatedMessageLite2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.J
        public final GeneratedMessageLite b() {
            return this.f10115a;
        }

        public final Object clone() {
            a aVar = (a) this.f10115a.k(MethodToInvoke.f10112e);
            MessageType h9 = h();
            aVar.i();
            j(aVar.f10116b, h9);
            return aVar;
        }

        public final MessageType g() {
            MessageType h9 = h();
            if (h9.n()) {
                return h9;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType h() {
            if (this.f10117c) {
                return this.f10116b;
            }
            MessageType messagetype = this.f10116b;
            messagetype.getClass();
            T t3 = T.f10158c;
            t3.getClass();
            t3.a(messagetype.getClass()).b(messagetype);
            this.f10117c = true;
            return this.f10116b;
        }

        public final void i() {
            if (this.f10117c) {
                MessageType messagetype = (MessageType) this.f10116b.k(MethodToInvoke.f10111d);
                j(messagetype, this.f10116b);
                this.f10116b = messagetype;
                this.f10117c = false;
            }
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends AbstractC0655b<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements J {
        protected C0670q<d> extensions = C0670q.f10257d;
    }

    public static final class d implements C0670q.a<d> {
        @Override // com.google.crypto.tink.shaded.protobuf.C0670q.a
        public final WireFormat$JavaType b() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }
    }

    public static class e<ContainingType extends I, Type> extends Y8.a {
    }

    public static <T extends GeneratedMessageLite<?, ?>> T l(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) h0.a(cls)).k(MethodToInvoke.f10113f);
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T o(T t3, ByteString byteString, C0666m c0666m) {
        AbstractC0661h.a h9 = byteString.h();
        T t10 = (T) q(t3, h9, c0666m);
        h9.a(0);
        if (t10.n()) {
            return t10;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T p(T t3, byte[] bArr, C0666m c0666m) {
        int length = bArr.length;
        T t10 = (T) t3.k(MethodToInvoke.f10111d);
        try {
            T t11 = T.f10158c;
            t11.getClass();
            X a10 = t11.a(t10.getClass());
            a10.e(t10, bArr, 0, length, new C0658e.a(c0666m));
            a10.b(t10);
            if (t10.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (t10.n()) {
                return t10;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T q(T t3, AbstractC0661h abstractC0661h, C0666m c0666m) {
        T t10 = (T) t3.k(MethodToInvoke.f10111d);
        try {
            T t11 = T.f10158c;
            t11.getClass();
            X a10 = t11.a(t10.getClass());
            C0662i c0662i = abstractC0661h.f10226c;
            if (c0662i == null) {
                c0662i = new C0662i(abstractC0661h);
            }
            a10.f(t10, c0662i, c0666m);
            a10.b(t10);
            return t10;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void r(Class<T> cls, T t3) {
        defaultInstanceMap.put(cls, t3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(CodedOutputStream codedOutputStream) {
        T t3 = T.f10158c;
        t3.getClass();
        X a10 = t3.a(getClass());
        C0663j c0663j = codedOutputStream.f10092a;
        if (c0663j == null) {
            c0663j = new C0663j(codedOutputStream);
        }
        a10.d(this, c0663j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public final GeneratedMessageLite b() {
        return (GeneratedMessageLite) k(MethodToInvoke.f10113f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final int d() {
        if (this.memoizedSerializedSize == -1) {
            T t3 = T.f10158c;
            t3.getClass();
            this.memoizedSerializedSize = t3.a(getClass()).h(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final a e() {
        a aVar = (a) k(MethodToInvoke.f10112e);
        aVar.i();
        a.j(aVar.f10116b, this);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) k(MethodToInvoke.f10113f)).getClass().isInstance(obj)) {
            return false;
        }
        T t3 = T.f10158c;
        t3.getClass();
        return t3.a(getClass()).g(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final a f() {
        return (a) k(MethodToInvoke.f10112e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0654a
    public final int g() {
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        T t3 = T.f10158c;
        t3.getClass();
        int i9 = t3.a(getClass()).i(this);
        this.memoizedHashCode = i9;
        return i9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0654a
    public final void i(int i) {
        this.memoizedSerializedSize = i;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType j() {
        return (BuilderType) k(MethodToInvoke.f10112e);
    }

    public abstract Object k(MethodToInvoke methodToInvoke);

    public final boolean n() {
        byte byteValue = ((Byte) k(MethodToInvoke.f10108a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t3 = T.f10158c;
        t3.getClass();
        boolean c2 = t3.a(getClass()).c(this);
        k(MethodToInvoke.f10109b);
        return c2;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        K.c(this, sb2, 0);
        return sb2.toString();
    }
}
