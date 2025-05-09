package Fa;

import C.N;
import P9.D;
import P9.s;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.core.data.model.p;
import h3.InterfaceC0795a;
import ia.InterfaceC0835c;
import j3.q;
import java.lang.reflect.Method;
import java.net.URI;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.EmptySet;
import na.InterfaceC1081e;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;

/* compiled from: CloseGuard.kt */
/* loaded from: classes2.dex */
public final class h implements qb.f, FutureCallback, O9.f, InterfaceC0795a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1298a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1299b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1300c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1301d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i) {
        this.f1298a = i;
        this.f1299b = obj;
        this.f1300c = obj2;
        this.f1301d = obj3;
    }

    @Override // h3.InterfaceC0795a
    public byte[] a(int i, byte[] bArr) {
        byte[] M8;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher a10 = j3.k.f22494e.a("AES/ECB/NoPadding");
        a10.init(1, (SecretKeySpec) this.f1299b);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (max * 16 == bArr.length) {
            M8 = j3.e.L(bArr, (max - 1) * 16, (byte[]) this.f1300c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = ISOFileInfo.DATA_BYTES1;
            M8 = j3.e.M(copyOf, (byte[]) this.f1301d);
        }
        byte[] bArr2 = new byte[16];
        for (int i9 = 0; i9 < max - 1; i9++) {
            bArr2 = a10.doFinal(j3.e.L(bArr2, 0, bArr, i9 * 16, 16));
        }
        return Arrays.copyOf(a10.doFinal(j3.e.M(M8, bArr2)), i);
    }

    @Override // qb.f
    public Object b(Object obj) {
        return ((I3.b) this.f1301d).c((okhttp3.i) this.f1299b, (InterfaceC1081e) this.f1300c, obj);
    }

    @Override // O9.f
    public boolean c() {
        throw null;
    }

    public void d() {
        HashSet hashSet = (HashSet) this.f1301d;
        if (!hashSet.isEmpty()) {
            h hVar = (h) this.f1299b;
            if (((N) hVar.f1301d).j(Level.f25554a)) {
                ((N) hVar.f1301d).f("Creating eager instances ...");
            }
            h hVar2 = new h(hVar, ((ib.a) hVar.f1299b).f21521b, null, 7);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((SingleInstanceFactory) it.next()).b(hVar2);
            }
        }
        hashSet.clear();
    }

    public void e(List list, boolean z10) {
        Set set = EmptySet.f23106a;
        while (!list.isEmpty()) {
            fb.a aVar = (fb.a) s.J(list);
            if (aVar == null) {
                throw new IllegalStateException("Flatten - No head element in list".toString());
            }
            list = list.subList(1, list.size());
            ArrayList arrayList = aVar.f20727f;
            if (arrayList.isEmpty()) {
                set = D.o(set, aVar);
            } else {
                list = s.U(arrayList, list);
                set = D.o(set, aVar);
            }
        }
        h hVar = (h) this.f1300c;
        hVar.getClass();
        Set<fb.a> set2 = set;
        for (fb.a aVar2 : set2) {
            for (Map.Entry<String, db.b<?>> entry : aVar2.f20725d.entrySet()) {
                String key = entry.getKey();
                db.b<?> value = entry.getValue();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar.f1300c;
                boolean containsKey = concurrentHashMap.containsKey(key);
                BeanDefinition<?> beanDefinition = value.f20487a;
                h hVar2 = (h) hVar.f1299b;
                if (containsKey) {
                    if (!z10) {
                        U4.b.s(value, key);
                        throw null;
                    }
                    N n10 = (N) hVar2.f1301d;
                    Objects.toString(beanDefinition);
                    ((Level) n10.f535b).compareTo(Level.f25555b);
                }
                if (((N) hVar2.f1301d).j(Level.f25554a)) {
                    ((N) hVar2.f1301d).f("add mapping '" + key + "' for " + beanDefinition);
                }
                concurrentHashMap.put(key, value);
            }
            ((HashSet) hVar.f1301d).addAll(aVar2.f20724c);
        }
        ib.a aVar3 = (ib.a) this.f1299b;
        aVar3.getClass();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            aVar3.f21520a.addAll(((fb.a) it.next()).f20726e);
        }
    }

    @Override // O9.f
    public Object getValue() {
        U0.e eVar = (U0.e) this.f1301d;
        if (eVar != null) {
            return eVar;
        }
        Bundle bundle = (Bundle) ((InterfaceC0635a) this.f1300c).invoke();
        androidx.collection.a<InterfaceC0835c<? extends U0.e>, Method> aVar = U0.f.f3596b;
        InterfaceC0835c<? extends U0.e> interfaceC0835c = (InterfaceC0835c) this.f1299b;
        Method method = aVar.get(interfaceC0835c);
        if (method == null) {
            method = ((kotlin.jvm.internal.a) interfaceC0835c).g().getMethod("fromBundle", (Class[]) Arrays.copyOf(U0.f.f3595a, 1));
            aVar.put(interfaceC0835c, method);
        }
        U0.e eVar2 = (U0.e) method.invoke(null, bundle);
        this.f1301d = eVar2;
        return eVar2;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        ((androidx.camera.view.a) this.f1301d).f5837e = null;
        List list = (List) this.f1299b;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((CameraInfoInternal) ((CameraInfo) this.f1300c)).removeSessionCaptureCallback((CameraCaptureCallback) it.next());
        }
        list.clear();
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        ((androidx.camera.view.a) this.f1301d).f5837e = null;
    }

    public String toString() {
        switch (this.f1298a) {
            case 4:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f1299b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                String str = (String) this.f1300c;
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
                String str2 = (String) this.f1301d;
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Double d10) {
        this(Boolean.TRUE, d10, Boolean.FALSE);
        this.f1298a = 10;
    }

    public h(Boolean bool, Double d10, Boolean bool2) {
        this.f1298a = 10;
        this.f1299b = bool;
        this.f1300c = d10;
        this.f1301d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    public h(kotlin.jvm.internal.b bVar, InterfaceC0635a interfaceC0635a) {
        this.f1298a = 3;
        this.f1299b = bVar;
        this.f1300c = interfaceC0635a;
    }

    public h(h hVar) {
        this.f1298a = 8;
        this.f1299b = hVar;
        this.f1300c = new ConcurrentHashMap();
        this.f1301d = new HashSet();
    }

    public h(int i) {
        this.f1298a = i;
        switch (i) {
            case 6:
                break;
            default:
                this.f1299b = new ib.a(this);
                this.f1300c = new h(this);
                new ConcurrentHashMap();
                this.f1301d = new N(13, (byte) 0);
                break;
        }
    }

    public h(byte[] bArr) {
        this.f1298a = 11;
        q.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f1299b = secretKeySpec;
        Cipher a10 = j3.k.f22494e.a("AES/ECB/NoPadding");
        a10.init(1, secretKeySpec);
        byte[] k3 = j3.e.k(a10.doFinal(new byte[16]));
        this.f1300c = k3;
        this.f1301d = j3.e.k(k3);
    }

    public h(String str) {
        this.f1298a = 9;
        try {
            D9.b.t0(str, "The DSN is required.");
            URI normalize = new URI(str).normalize();
            String userInfo = normalize.getUserInfo();
            if (userInfo != null && !userInfo.isEmpty()) {
                String[] split = userInfo.split(p.f15541a, -1);
                String str2 = split[0];
                this.f1300c = str2;
                if (str2 != null && !str2.isEmpty()) {
                    this.f1299b = split.length > 1 ? split[1] : null;
                    String path = normalize.getPath();
                    path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
                    int lastIndexOf = path.lastIndexOf("/") + 1;
                    String substring = path.substring(0, lastIndexOf);
                    substring = substring.endsWith("/") ? substring : substring.concat("/");
                    String substring2 = path.substring(lastIndexOf);
                    if (!substring2.isEmpty()) {
                        this.f1301d = new URI(normalize.getScheme(), null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                }
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }

    public h(Intent intent) {
        this.f1298a = 4;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f1299b = data;
        this.f1300c = action;
        this.f1301d = type;
    }

    public h(androidx.camera.view.a aVar, ArrayList arrayList, CameraInfoInternal cameraInfoInternal) {
        this.f1298a = 2;
        this.f1301d = aVar;
        this.f1299b = arrayList;
        this.f1300c = cameraInfoInternal;
    }
}
