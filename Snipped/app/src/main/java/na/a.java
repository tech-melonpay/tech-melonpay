package Na;

import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import ta.v;

/* compiled from: BlockContent.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2857a;

    /* renamed from: b, reason: collision with root package name */
    public int f2858b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2859c;

    public void a(int i, int i9) {
        int i10 = i9 + i;
        char[] cArr = (char[]) this.f2859c;
        if (cArr.length <= i10) {
            int i11 = i * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            this.f2859c = Arrays.copyOf(cArr, i10);
        }
    }

    public HashMap b(Map map, InterfaceC0859q interfaceC0859q) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), f(interfaceC0859q, obj2));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    public void c(int i, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            boolean z10 = true;
            if (((i >>> ((i9 - i10) - 1)) & 1) != 1) {
                z10 = false;
            }
            d(z10);
        }
    }

    public void d(boolean z10) {
        int i = this.f2858b;
        int[] iArr = (int[]) this.f2859c;
        if (i == iArr.length * 8) {
            this.f2859c = Arrays.copyOf(iArr, iArr.length + 32);
        }
        if (z10) {
            int[] iArr2 = (int[]) this.f2859c;
            int i9 = this.f2858b;
            iArr2[i9 / 8] = (128 >>> (i9 % 8)) | iArr2[i9 / 8];
        }
        this.f2858b++;
    }

    public void e() {
        ta.d dVar = ta.d.f29981d;
        char[] cArr = (char[]) this.f2859c;
        synchronized (dVar) {
            try {
                int i = dVar.f2858b;
                if (cArr.length + i < ta.c.f29980a) {
                    dVar.f2858b = i + cArr.length;
                    ((P9.h) dVar.f2859c).addLast(cArr);
                }
                O9.p pVar = O9.p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object f(InterfaceC0859q interfaceC0859q, Object obj) {
        Object obj2;
        Object obj3 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return D9.b.h((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = (HashSet) this.f2859c;
        if (hashSet.contains(obj)) {
            interfaceC0859q.h(SentryLevel.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.f2858b) {
                hashSet.remove(obj);
                interfaceC0859q.h(SentryLevel.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    Object[] objArr = (Object[]) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = objArr.length;
                    while (i < length2) {
                        arrayList2.add(f(interfaceC0859q, objArr[i]));
                        i++;
                    }
                    obj3 = arrayList2;
                } else if (obj instanceof Collection) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        arrayList3.add(f(interfaceC0859q, it.next()));
                    }
                    obj3 = arrayList3;
                } else {
                    if (obj instanceof Map) {
                        obj2 = b((Map) obj, interfaceC0859q);
                    } else {
                        HashMap g10 = g(interfaceC0859q, obj);
                        if (g10.isEmpty()) {
                            obj2 = obj.toString();
                        } else {
                            obj3 = g10;
                        }
                    }
                    obj3 = obj2;
                }
            } catch (Exception e10) {
                interfaceC0859q.f(SentryLevel.INFO, "Not serializing object due to throwing sub-path.", e10);
            }
            return obj3;
        } finally {
            hashSet.remove(obj);
        }
    }

    public HashMap g(InterfaceC0859q interfaceC0859q, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, f(interfaceC0859q, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    interfaceC0859q.h(SentryLevel.INFO, androidx.camera.core.n.a("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return hashMap;
    }

    public void h(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.f2858b, length);
        str.getChars(0, str.length(), (char[]) this.f2859c, this.f2858b);
        this.f2858b += length;
    }

    public void i(char c2) {
        a(this.f2858b, 1);
        char[] cArr = (char[]) this.f2859c;
        int i = this.f2858b;
        this.f2858b = i + 1;
        cArr[i] = c2;
    }

    public void j(long j10) {
        h(String.valueOf(j10));
    }

    public void k(String str) {
        int i;
        a(this.f2858b, str.length() + 2);
        char[] cArr = (char[]) this.f2859c;
        int i9 = this.f2858b;
        int i10 = i9 + 1;
        cArr[i9] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c2 = cArr[i12];
            byte[] bArr = v.f30031b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = str.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    a(i12, 2);
                    char charAt = str.charAt(i13);
                    byte[] bArr2 = v.f30031b;
                    if (charAt < bArr2.length) {
                        byte b9 = bArr2[charAt];
                        if (b9 == 0) {
                            i = i12 + 1;
                            ((char[]) this.f2859c)[i12] = charAt;
                        } else {
                            if (b9 == 1) {
                                String str2 = v.f30030a[charAt];
                                a(i12, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.f2859c, i12);
                                int length3 = str2.length() + i12;
                                this.f2858b = length3;
                                i12 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.f2859c;
                                cArr2[i12] = '\\';
                                cArr2[i12 + 1] = (char) b9;
                                i12 += 2;
                                this.f2858b = i12;
                            }
                        }
                    } else {
                        i = i12 + 1;
                        ((char[]) this.f2859c)[i12] = charAt;
                    }
                    i12 = i;
                }
                a(i12, 1);
                ((char[]) this.f2859c)[i12] = '\"';
                this.f2858b = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        this.f2858b = i11 + 1;
    }

    public String toString() {
        switch (this.f2857a) {
            case 1:
                return this.f2858b + ": " + ((String) this.f2859c);
            case 2:
            case 4:
            default:
                return super.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder();
                int i = this.f2858b;
                for (int i9 = 0; i9 < i; i9++) {
                    sb2.append(((((int[]) this.f2859c)[i9 / 8] >>> (7 - (i9 % 8))) & 1) == 1 ? '1' : '0');
                }
                return sb2.toString();
            case 5:
                return new String((char[]) this.f2859c, 0, this.f2858b);
        }
    }

    public a(int i, byte b9) {
        this.f2857a = i;
        switch (i) {
            case 3:
                this.f2859c = new int[32];
                this.f2858b = 0;
                break;
            case 4:
                this.f2859c = new P9.h();
                break;
            default:
                this.f2858b = 0;
                this.f2859c = new StringBuilder();
                break;
        }
    }

    public a(int i, String str, Object[] objArr) {
        this.f2857a = 1;
        this.f2859c = String.format(str, objArr);
        this.f2858b = i;
    }

    public a(int i) {
        this.f2857a = 2;
        this.f2859c = new HashSet();
        this.f2858b = i;
    }
}
