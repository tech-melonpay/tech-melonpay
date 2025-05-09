package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodecList f17321a;

    public static final class a extends Lambda implements InterfaceC0635a<List<? extends y>> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<y> invoke() {
            return h.this.b();
        }
    }

    public h(MediaCodecList mediaCodecList) {
        this.f17321a = mediaCodecList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public final List<y> b() {
        String str;
        ?? r72;
        MediaCodecInfo[] codecInfos = this.f17321a.getCodecInfos();
        ArrayList arrayList = new ArrayList(codecInfos.length);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo == null || (str = mediaCodecInfo.getName()) == null) {
                str = "";
            }
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (supportedTypes != null) {
                r72 = new ArrayList();
                for (String str2 : supportedTypes) {
                    r72.add(String.valueOf(str2));
                }
            } else {
                r72 = EmptyList.f23104a;
            }
            arrayList.add(new y(str, r72));
        }
        return arrayList;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.g
    public List<y> a() {
        Object a10 = c.a(0L, new a(), 1, null);
        EmptyList emptyList = EmptyList.f23104a;
        if (a10 instanceof Result.Failure) {
            a10 = emptyList;
        }
        return (List) a10;
    }
}
