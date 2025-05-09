package androidx.security.crypto;

import C.v;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import b3.InterfaceC0586a;
import b3.c;
import b3.e;
import b3.f;
import c3.i;
import e3.C0712a;
import i3.m;
import i3.q;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.GenericDeclaration;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7848a;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0586a f7851d;

    /* renamed from: e, reason: collision with root package name */
    public final c f7852e;

    /* renamed from: c, reason: collision with root package name */
    public final String f7850c = "crypto_prefs";

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7849b = new ArrayList();

    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        EncryptedType(int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class PrefKeyEncryptionScheme {

        /* renamed from: b, reason: collision with root package name */
        public static final PrefKeyEncryptionScheme f7860b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ PrefKeyEncryptionScheme[] f7861c;

        /* renamed from: a, reason: collision with root package name */
        public final e f7862a;

        static {
            q.a v10 = q.v();
            v10.i();
            q.t((q) v10.f10116b);
            q g10 = v10.g();
            f.b[] bVarArr = {new C0712a.C0393a(c.class)};
            HashMap hashMap = new HashMap();
            f.b bVar = bVarArr[0];
            boolean containsKey = hashMap.containsKey(bVar.f8296a);
            Class<PrimitiveT> cls = bVar.f8296a;
            if (containsKey) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls, bVar);
            GenericDeclaration genericDeclaration = bVarArr[0].f8296a;
            Collections.unmodifiableMap(hashMap);
            PrefKeyEncryptionScheme prefKeyEncryptionScheme = new PrefKeyEncryptionScheme(e.a("type.googleapis.com/google.crypto.tink.AesSivKey", g10.toByteArray()));
            f7860b = prefKeyEncryptionScheme;
            f7861c = new PrefKeyEncryptionScheme[]{prefKeyEncryptionScheme};
        }

        public PrefKeyEncryptionScheme(e eVar) {
            this.f7862a = eVar;
        }

        public static PrefKeyEncryptionScheme valueOf(String str) {
            return (PrefKeyEncryptionScheme) Enum.valueOf(PrefKeyEncryptionScheme.class, str);
        }

        public static PrefKeyEncryptionScheme[] values() {
            return (PrefKeyEncryptionScheme[]) f7861c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class PrefValueEncryptionScheme {

        /* renamed from: b, reason: collision with root package name */
        public static final PrefValueEncryptionScheme f7863b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ PrefValueEncryptionScheme[] f7864c;

        /* renamed from: a, reason: collision with root package name */
        public final e f7865a;

        static {
            m.a v10 = m.v();
            v10.i();
            m.t((m) v10.f10116b);
            m g10 = v10.g();
            f.b[] bVarArr = {new i(InterfaceC0586a.class)};
            HashMap hashMap = new HashMap();
            f.b bVar = bVarArr[0];
            boolean containsKey = hashMap.containsKey(bVar.f8296a);
            Class<PrimitiveT> cls = bVar.f8296a;
            if (containsKey) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls, bVar);
            GenericDeclaration genericDeclaration = bVarArr[0].f8296a;
            Collections.unmodifiableMap(hashMap);
            PrefValueEncryptionScheme prefValueEncryptionScheme = new PrefValueEncryptionScheme(e.a("type.googleapis.com/google.crypto.tink.AesGcmKey", g10.toByteArray()));
            f7863b = prefValueEncryptionScheme;
            f7864c = new PrefValueEncryptionScheme[]{prefValueEncryptionScheme};
        }

        public PrefValueEncryptionScheme(e eVar) {
            this.f7865a = eVar;
        }

        public static PrefValueEncryptionScheme valueOf(String str) {
            return (PrefValueEncryptionScheme) Enum.valueOf(PrefValueEncryptionScheme.class, str);
        }

        public static PrefValueEncryptionScheme[] values() {
            return (PrefValueEncryptionScheme[]) f7864c.clone();
        }
    }

    public static final class a implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final EncryptedSharedPreferences f7866a;

        /* renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f7867b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f7869d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f7868c = new CopyOnWriteArrayList();

        public a(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f7866a = encryptedSharedPreferences;
            this.f7867b = editor;
        }

        public final void a() {
            if (this.f7869d.getAndSet(false)) {
                EncryptedSharedPreferences encryptedSharedPreferences = this.f7866a;
                for (String str : ((HashMap) encryptedSharedPreferences.getAll()).keySet()) {
                    if (!this.f7868c.contains(str) && !EncryptedSharedPreferences.c(str)) {
                        this.f7867b.remove(encryptedSharedPreferences.a(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.f7867b.apply();
            b();
            this.f7868c.clear();
        }

        public final void b() {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f7866a;
            Iterator it = encryptedSharedPreferences.f7849b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f7868c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(encryptedSharedPreferences, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f7866a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.c(str)) {
                throw new SecurityException(v.n(str, " is a reserved key for the encryption keyset."));
            }
            this.f7868c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String a10 = encryptedSharedPreferences.a(str);
                try {
                    Pair pair = new Pair(a10, new String(j3.f.b(encryptedSharedPreferences.f7851d.a(bArr, a10.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.f7867b.putString((String) pair.first, (String) pair.second);
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError(e10);
                }
            } catch (GeneralSecurityException e11) {
                throw new SecurityException(androidx.camera.core.impl.utils.a.p(e11, new StringBuilder("Could not encrypt data: ")), e11);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.f7869d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f7868c;
            a();
            try {
                return this.f7867b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(5);
            allocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(4);
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(2);
            allocate.putInt(i);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(3);
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(0);
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            Set<String> set2 = set;
            if (set == null) {
                ArraySet arraySet = new ArraySet();
                arraySet.add("__NULL__");
                set2 = arraySet;
            }
            ArrayList arrayList = new ArrayList(set2.size());
            int size = set2.size() * 4;
            Iterator<String> it = set2.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(1);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f7866a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.c(str)) {
                throw new SecurityException(v.n(str, " is a reserved key for the encryption keyset."));
            }
            this.f7867b.remove(encryptedSharedPreferences.a(str));
            this.f7868c.remove(str);
            return this;
        }
    }

    public EncryptedSharedPreferences(SharedPreferences sharedPreferences, InterfaceC0586a interfaceC0586a, c cVar) {
        this.f7848a = sharedPreferences;
        this.f7851d = interfaceC0586a;
        this.f7852e = cVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(j3.f.b(this.f7852e.a(str.getBytes(StandardCharsets.UTF_8), this.f7850c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new SecurityException(androidx.camera.core.impl.utils.a.p(e11, new StringBuilder("Could not encrypt key. ")), e11);
        }
    }

    public final Object b(String str) {
        if (c(str)) {
            throw new SecurityException(v.n(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String a10 = a(str);
            String string = this.f7848a.getString(a10, null);
            if (string == null) {
                return null;
            }
            byte[] a11 = j3.f.a(string);
            InterfaceC0586a interfaceC0586a = this.f7851d;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer wrap = ByteBuffer.wrap(interfaceC0586a.decrypt(a11, a10.getBytes(charset)));
            wrap.position(0);
            int i = wrap.getInt();
            int ordinal = (i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : EncryptedType.BOOLEAN : EncryptedType.FLOAT : EncryptedType.LONG : EncryptedType.INT : EncryptedType.STRING_SET : EncryptedType.STRING).ordinal();
            if (ordinal == 0) {
                int i9 = wrap.getInt();
                ByteBuffer slice = wrap.slice();
                wrap.limit(i9);
                String charBuffer = charset.decode(slice).toString();
                if (charBuffer.equals("__NULL__")) {
                    return null;
                }
                return charBuffer;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return Integer.valueOf(wrap.getInt());
                }
                if (ordinal == 3) {
                    return Long.valueOf(wrap.getLong());
                }
                if (ordinal == 4) {
                    return Float.valueOf(wrap.getFloat());
                }
                if (ordinal != 5) {
                    return null;
                }
                return Boolean.valueOf(wrap.get() != 0);
            }
            ArraySet arraySet = new ArraySet();
            while (wrap.hasRemaining()) {
                int i10 = wrap.getInt();
                ByteBuffer slice2 = wrap.slice();
                slice2.limit(i10);
                wrap.position(wrap.position() + i10);
                arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
            }
            if (arraySet.size() == 1 && "__NULL__".equals(arraySet.valueAt(0))) {
                return null;
            }
            return arraySet;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException(androidx.camera.core.impl.utils.a.p(e10, new StringBuilder("Could not decrypt value. ")), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (c(str)) {
            throw new SecurityException(v.n(str, " is a reserved key for the encryption keyset."));
        }
        return this.f7848a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f7848a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f7848a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f7852e.b(j3.f.a(entry.getKey()), this.f7850c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, b(str));
                } catch (GeneralSecurityException e10) {
                    throw new SecurityException(androidx.camera.core.impl.utils.a.p(e10, new StringBuilder("Could not decrypt key. ")), e10);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        Object b9 = b(str);
        return (b9 == null || !(b9 instanceof Boolean)) ? z10 : ((Boolean) b9).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        Object b9 = b(str);
        return (b9 == null || !(b9 instanceof Float)) ? f10 : ((Float) b9).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object b9 = b(str);
        return (b9 == null || !(b9 instanceof Integer)) ? i : ((Integer) b9).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        Object b9 = b(str);
        return (b9 == null || !(b9 instanceof Long)) ? j10 : ((Long) b9).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object b9 = b(str);
        return (b9 == null || !(b9 instanceof String)) ? str2 : (String) b9;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Object b9 = b(str);
        Set<String> arraySet = b9 instanceof Set ? (Set) b9 : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7849b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7849b.remove(onSharedPreferenceChangeListener);
    }
}
