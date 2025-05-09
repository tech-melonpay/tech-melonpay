package com.sumsub.sns.internal.presentation.screen.preview.photo;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.camera.photo.presentation.document.DocCapture$PreferredMode;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.domain.o;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.ml.core.e;
import com.sumsub.sns.internal.presentation.screen.preview.a;
import com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel;
import ia.InterfaceC0840h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.NonCancellable;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.tls.NamedGroup;

/* loaded from: classes2.dex */
public abstract class SNSPreviewPhotoDocumentViewModel extends com.sumsub.sns.internal.presentation.screen.preview.a<g> {

    /* renamed from: N, reason: collision with root package name */
    public static final a f18419N;

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f18420O;

    /* renamed from: C, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f18421C;

    /* renamed from: D, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.o f18422D;

    /* renamed from: E, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.common.o0 f18423E;

    /* renamed from: F, reason: collision with root package name */
    public final com.sumsub.sns.internal.ml.core.e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> f18424F;

    /* renamed from: G, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18425G;

    /* renamed from: H, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18426H;

    /* renamed from: I, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18427I;

    /* renamed from: J, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18428J;

    /* renamed from: K, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18429K;

    /* renamed from: L, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18430L;

    /* renamed from: M, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18431M;

    public static final class Content {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18432a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18433b;

        /* renamed from: c, reason: collision with root package name */
        public final a f18434c;

        /* renamed from: d, reason: collision with root package name */
        public final a f18435d;

        /* renamed from: e, reason: collision with root package name */
        public final Icon f18436e;

        /* renamed from: f, reason: collision with root package name */
        public final State f18437f;

        /* renamed from: g, reason: collision with root package name */
        public final b f18438g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;", "", "(Ljava/lang/String;I)V", "CONTINUE", "TRY_AGAIN", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum ButtonAction {
            CONTINUE,
            TRY_AGAIN
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$Icon;", "", "(Ljava/lang/String;I)V", "WARNING", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum Icon {
            WARNING
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$State;", "", "(Ljava/lang/String;I)V", "OK", "WARNING", "BLOCKING", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum State {
            OK,
            WARNING,
            BLOCKING
        }

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final ButtonAction f18439a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f18440b;

            public a(ButtonAction buttonAction, CharSequence charSequence) {
                this.f18439a = buttonAction;
                this.f18440b = charSequence;
            }

            public final ButtonAction c() {
                return this.f18439a;
            }

            public final CharSequence d() {
                return this.f18440b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f18439a == aVar.f18439a && kotlin.jvm.internal.f.b(this.f18440b, aVar.f18440b);
            }

            public int hashCode() {
                int hashCode = this.f18439a.hashCode() * 31;
                CharSequence charSequence = this.f18440b;
                return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ButtonDescription(action=");
                sb2.append(this.f18439a);
                sb2.append(", text=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.f18440b, ')');
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f18441a;

            /* renamed from: b, reason: collision with root package name */
            public final int f18442b;

            public b(CharSequence charSequence, int i) {
                this.f18441a = charSequence;
                this.f18442b = i;
            }

            public final b a(CharSequence charSequence, int i) {
                return new b(charSequence, i);
            }

            public final CharSequence c() {
                return this.f18441a;
            }

            public final int d() {
                return this.f18442b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.f.b(this.f18441a, bVar.f18441a) && this.f18442b == bVar.f18442b;
            }

            public int hashCode() {
                CharSequence charSequence = this.f18441a;
                return Integer.hashCode(this.f18442b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Progress(title=");
                sb2.append((Object) this.f18441a);
                sb2.append(", value=");
                return androidx.camera.core.impl.utils.a.m(sb2, this.f18442b, ')');
            }

            public static /* synthetic */ b a(b bVar, CharSequence charSequence, int i, int i9, Object obj) {
                if ((i9 & 1) != 0) {
                    charSequence = bVar.f18441a;
                }
                if ((i9 & 2) != 0) {
                    i = bVar.f18442b;
                }
                return bVar.a(charSequence, i);
            }
        }

        public Content(CharSequence charSequence, CharSequence charSequence2, a aVar, a aVar2, Icon icon, State state, b bVar) {
            this.f18432a = charSequence;
            this.f18433b = charSequence2;
            this.f18434c = aVar;
            this.f18435d = aVar2;
            this.f18436e = icon;
            this.f18437f = state;
            this.f18438g = bVar;
        }

        public final Content a(CharSequence charSequence, CharSequence charSequence2, a aVar, a aVar2, Icon icon, State state, b bVar) {
            return new Content(charSequence, charSequence2, aVar, aVar2, icon, state, bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return kotlin.jvm.internal.f.b(this.f18432a, content.f18432a) && kotlin.jvm.internal.f.b(this.f18433b, content.f18433b) && kotlin.jvm.internal.f.b(this.f18434c, content.f18434c) && kotlin.jvm.internal.f.b(this.f18435d, content.f18435d) && this.f18436e == content.f18436e && this.f18437f == content.f18437f && kotlin.jvm.internal.f.b(this.f18438g, content.f18438g);
        }

        public final a h() {
            return this.f18435d;
        }

        public int hashCode() {
            CharSequence charSequence = this.f18432a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18433b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            a aVar = this.f18434c;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.f18435d;
            int hashCode4 = (hashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            Icon icon = this.f18436e;
            int hashCode5 = (this.f18437f.hashCode() + ((hashCode4 + (icon == null ? 0 : icon.hashCode())) * 31)) * 31;
            b bVar = this.f18438g;
            return hashCode5 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final a i() {
            return this.f18434c;
        }

        public final Icon j() {
            return this.f18436e;
        }

        public final b k() {
            return this.f18438g;
        }

        public final State l() {
            return this.f18437f;
        }

        public final CharSequence m() {
            return this.f18433b;
        }

        public final CharSequence n() {
            return this.f18432a;
        }

        public String toString() {
            return "Content(title=" + ((Object) this.f18432a) + ", subtitle=" + ((Object) this.f18433b) + ", buttonPositive=" + this.f18434c + ", buttonNegative=" + this.f18435d + ", icon=" + this.f18436e + ", state=" + this.f18437f + ", progress=" + this.f18438g + ')';
        }

        public static /* synthetic */ Content a(Content content, CharSequence charSequence, CharSequence charSequence2, a aVar, a aVar2, Icon icon, State state, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = content.f18432a;
            }
            if ((i & 2) != 0) {
                charSequence2 = content.f18433b;
            }
            CharSequence charSequence3 = charSequence2;
            if ((i & 4) != 0) {
                aVar = content.f18434c;
            }
            a aVar3 = aVar;
            if ((i & 8) != 0) {
                aVar2 = content.f18435d;
            }
            a aVar4 = aVar2;
            if ((i & 16) != 0) {
                icon = content.f18436e;
            }
            Icon icon2 = icon;
            if ((i & 32) != 0) {
                state = content.f18437f;
            }
            State state2 = state;
            if ((i & 64) != 0) {
                bVar = content.f18438g;
            }
            return content.a(charSequence, charSequence3, aVar3, aVar4, icon2, state2, bVar);
        }

        public /* synthetic */ Content(CharSequence charSequence, CharSequence charSequence2, a aVar, a aVar2, Icon icon, State state, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : aVar2, (i & 16) != 0 ? null : icon, state, (i & 64) != 0 ? null : bVar);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDocumentsUploadedError$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a0 extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18443a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18444b;

        public a0(T9.a<? super a0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, T9.a<? super g> aVar) {
            return ((a0) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            a0 a0Var = new a0(aVar);
            a0Var.f18444b = obj;
            return a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18443a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            g gVar = (g) this.f18444b;
            Content f10 = gVar.f();
            return g.a(gVar, null, null, false, true, f10 != null ? Content.a(f10, null, null, null, null, null, null, null, 63, null) : null, 7, null);
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f18445a;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(int i) {
            this.f18445a = i;
        }

        public final b a(int i) {
            return new b(i);
        }

        public final int b() {
            return this.f18445a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f18445a == ((b) obj).f18445a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f18445a);
        }

        public String toString() {
            return androidx.camera.core.impl.utils.a.m(new StringBuilder("DocumentProperties(rotation="), this.f18445a, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f18445a);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {701, 798}, m = "onDocumentsUploadedSuccess")
    public static final class b0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18446a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18447b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18448c;

        /* renamed from: e, reason: collision with root package name */
        public int f18450e;

        public b0(T9.a<? super b0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18448c = obj;
            this.f18450e |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.a((List<com.sumsub.sns.internal.core.data.model.remote.k>) null, this);
        }
    }

    public static final class c implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.s f18451a;

        public c(com.sumsub.sns.internal.core.data.model.s sVar) {
            this.f18451a = sVar;
        }

        public final com.sumsub.sns.internal.core.data.model.s b() {
            return this.f18451a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.f.b(this.f18451a, ((c) obj).f18451a);
        }

        public int hashCode() {
            return this.f18451a.hashCode();
        }

        public String toString() {
            return "MRTDDocumentAction(document=" + this.f18451a + ')';
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f18469a;

        /* renamed from: b, reason: collision with root package name */
        public final File f18470b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18471c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f18472d;

        public d(Bitmap bitmap, File file, int i, boolean z10) {
            this.f18469a = bitmap;
            this.f18470b = file;
            this.f18471c = i;
            this.f18472d = z10;
        }

        public final d a(Bitmap bitmap, File file, int i, boolean z10) {
            return new d(bitmap, file, i, z10);
        }

        public final File e() {
            return this.f18470b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f18469a, dVar.f18469a) && kotlin.jvm.internal.f.b(this.f18470b, dVar.f18470b) && this.f18471c == dVar.f18471c && this.f18472d == dVar.f18472d;
        }

        public final Bitmap f() {
            return this.f18469a;
        }

        public final int g() {
            return this.f18471c;
        }

        public final boolean h() {
            return this.f18472d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Bitmap bitmap = this.f18469a;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            File file = this.f18470b;
            int b9 = C.v.b(this.f18471c, (hashCode + (file != null ? file.hashCode() : 0)) * 31, 31);
            boolean z10 = this.f18472d;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return b9 + i;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoDocument(photo=");
            sb2.append(this.f18469a);
            sb2.append(", file=");
            sb2.append(this.f18470b);
            sb2.append(", rotation=");
            sb2.append(this.f18471c);
            sb2.append(", rotationAvailable=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f18472d, ')');
        }

        public static /* synthetic */ d a(d dVar, Bitmap bitmap, File file, int i, boolean z10, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                bitmap = dVar.f18469a;
            }
            if ((i9 & 2) != 0) {
                file = dVar.f18470b;
            }
            if ((i9 & 4) != 0) {
                i = dVar.f18471c;
            }
            if ((i9 & 8) != 0) {
                z10 = dVar.f18472d;
            }
            return dVar.a(bitmap, file, i, z10);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$6", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18473a;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$6$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18475a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f18476b;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g gVar, T9.a<? super g> aVar) {
                return ((a) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(aVar);
                aVar2.f18476b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f18475a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return g.a((g) this.f18476b, null, null, true, false, null, 25, null);
            }
        }

        public d0(T9.a<? super d0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((d0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new d0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18473a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            SNSPreviewPhotoDocumentViewModel.this.c(false);
            com.sumsub.sns.core.presentation.base.a.a(SNSPreviewPhotoDocumentViewModel.this, false, new a(null), 1, null);
            return O9.p.f3034a;
        }
    }

    public static abstract class e implements a.j, Parcelable {

        public static final class a extends e {
            public static final Parcelable.Creator<a> CREATOR = new C0335a();

            /* renamed from: a, reason: collision with root package name */
            public final f f18477a;

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$e$a$a, reason: collision with other inner class name */
            public static final class C0335a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    return new a(f.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(f fVar) {
                super(null);
                this.f18477a = fVar;
            }

            public final f b() {
                return this.f18477a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.f.b(this.f18477a, ((a) obj).f18477a);
            }

            public int hashCode() {
                return this.f18477a.hashCode();
            }

            public String toString() {
                return "PhotoPickerRequestAction(pickerRequest=" + this.f18477a + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f18477a.writeToParcel(parcel, i);
            }
        }

        public static final class b extends e {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public final f f18478a;

            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    return new b(f.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i) {
                    return new b[i];
                }
            }

            public b(f fVar) {
                super(null);
                this.f18478a = fVar;
            }

            public final f b() {
                return this.f18478a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f18478a, ((b) obj).f18478a);
            }

            public int hashCode() {
                return this.f18478a.hashCode();
            }

            public String toString() {
                return "SelfieRequestAction(pickerRequest=" + this.f18478a + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f18478a.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public e() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onPhotoRotationChanged$2", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class e0 extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18479a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18480b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f18481c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f18482d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SNSPreviewPhotoDocumentViewModel f18483e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(File file, int i, SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, T9.a<? super e0> aVar) {
            super(2, aVar);
            this.f18481c = file;
            this.f18482d = i;
            this.f18483e = sNSPreviewPhotoDocumentViewModel;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, T9.a<? super g> aVar) {
            return ((e0) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            e0 e0Var = new e0(this.f18481c, this.f18482d, this.f18483e, aVar);
            e0Var.f18480b = obj;
            return e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            d a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18479a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            g gVar = (g) this.f18480b;
            List<d> g10 = gVar.g();
            File file = this.f18481c;
            int i = this.f18482d;
            SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = this.f18483e;
            ArrayList arrayList = new ArrayList(P9.n.u(g10, 10));
            for (d dVar : g10) {
                if (kotlin.jvm.internal.f.b(dVar.e(), file)) {
                    a10 = d.a(dVar, null, null, i, false, 11, null);
                } else {
                    Map D2 = sNSPreviewPhotoDocumentViewModel.D();
                    File e10 = dVar.e();
                    if (e10 == null || (str = e10.getAbsolutePath()) == null) {
                        str = "";
                    }
                    b bVar = (b) D2.get(str);
                    a10 = d.a(dVar, null, null, bVar != null ? bVar.b() : 0, false, 11, null);
                }
                arrayList.add(a10);
            }
            return g.a(gVar, arrayList, null, false, false, null, 30, null);
        }
    }

    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18484a;

        /* renamed from: b, reason: collision with root package name */
        public final Document f18485b;

        /* renamed from: c, reason: collision with root package name */
        public final List<IdentitySide> f18486c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f18487d;

        /* renamed from: e, reason: collision with root package name */
        public final String f18488e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f18489f;

        /* renamed from: g, reason: collision with root package name */
        public final DocCapture$PreferredMode f18490g;

        /* renamed from: h, reason: collision with root package name */
        public final com.sumsub.sns.internal.ml.badphotos.models.b f18491h;

        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                boolean z10 = parcel.readInt() != 0;
                Document createFromParcel = Document.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(IdentitySide.valueOf(parcel.readString()));
                }
                return new f(z10, createFromParcel, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : DocCapture$PreferredMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? com.sumsub.sns.internal.ml.badphotos.models.b.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(boolean z10, Document document, List<? extends IdentitySide> list, boolean z11, String str, boolean z12, DocCapture$PreferredMode docCapture$PreferredMode, com.sumsub.sns.internal.ml.badphotos.models.b bVar) {
            this.f18484a = z10;
            this.f18485b = document;
            this.f18486c = list;
            this.f18487d = z11;
            this.f18488e = str;
            this.f18489f = z12;
            this.f18490g = docCapture$PreferredMode;
            this.f18491h = bVar;
        }

        public final f a(boolean z10, Document document, List<? extends IdentitySide> list, boolean z11, String str, boolean z12, DocCapture$PreferredMode docCapture$PreferredMode, com.sumsub.sns.internal.ml.badphotos.models.b bVar) {
            return new f(z10, document, list, z11, str, z12, docCapture$PreferredMode, bVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f18484a == fVar.f18484a && kotlin.jvm.internal.f.b(this.f18485b, fVar.f18485b) && kotlin.jvm.internal.f.b(this.f18486c, fVar.f18486c) && this.f18487d == fVar.f18487d && kotlin.jvm.internal.f.b(this.f18488e, fVar.f18488e) && this.f18489f == fVar.f18489f && this.f18490g == fVar.f18490g && kotlin.jvm.internal.f.b(this.f18491h, fVar.f18491h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.f18484a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int f10 = C.v.f(this.f18486c, (this.f18485b.hashCode() + (r02 * 31)) * 31, 31);
            ?? r32 = this.f18487d;
            int i = r32;
            if (r32 != 0) {
                i = 1;
            }
            int i9 = (f10 + i) * 31;
            String str = this.f18488e;
            int hashCode = (i9 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z11 = this.f18489f;
            int i10 = (hashCode + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            DocCapture$PreferredMode docCapture$PreferredMode = this.f18490g;
            int hashCode2 = (i10 + (docCapture$PreferredMode == null ? 0 : docCapture$PreferredMode.hashCode())) * 31;
            com.sumsub.sns.internal.ml.badphotos.models.b bVar = this.f18491h;
            return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final Document i() {
            return this.f18485b;
        }

        public final boolean j() {
            return this.f18487d;
        }

        public final String k() {
            return this.f18488e;
        }

        public final DocCapture$PreferredMode l() {
            return this.f18490g;
        }

        public final com.sumsub.sns.internal.ml.badphotos.models.b m() {
            return this.f18491h;
        }

        public final boolean n() {
            return this.f18489f;
        }

        public final List<IdentitySide> o() {
            return this.f18486c;
        }

        public final boolean p() {
            return this.f18484a;
        }

        public String toString() {
            return "PickerRequest(isSeamless=" + this.f18484a + ", document=" + this.f18485b + ", sides=" + this.f18486c + ", gallery=" + this.f18487d + ", identityType=" + this.f18488e + ", retake=" + this.f18489f + ", preferredMode=" + this.f18490g + ", previousQualityResult=" + this.f18491h + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f18484a ? 1 : 0);
            this.f18485b.writeToParcel(parcel, i);
            List<IdentitySide> list = this.f18486c;
            parcel.writeInt(list.size());
            Iterator<IdentitySide> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeInt(this.f18487d ? 1 : 0);
            parcel.writeString(this.f18488e);
            parcel.writeInt(this.f18489f ? 1 : 0);
            DocCapture$PreferredMode docCapture$PreferredMode = this.f18490g;
            if (docCapture$PreferredMode == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(docCapture$PreferredMode.name());
            }
            com.sumsub.sns.internal.ml.badphotos.models.b bVar = this.f18491h;
            if (bVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bVar.writeToParcel(parcel, i);
            }
        }

        public static /* synthetic */ f a(f fVar, boolean z10, Document document, List list, boolean z11, String str, boolean z12, DocCapture$PreferredMode docCapture$PreferredMode, com.sumsub.sns.internal.ml.badphotos.models.b bVar, int i, Object obj) {
            return fVar.a((i & 1) != 0 ? fVar.f18484a : z10, (i & 2) != 0 ? fVar.f18485b : document, (i & 4) != 0 ? fVar.f18486c : list, (i & 8) != 0 ? fVar.f18487d : z11, (i & 16) != 0 ? fVar.f18488e : str, (i & 32) != 0 ? fVar.f18489f : z12, (i & 64) != 0 ? fVar.f18490g : docCapture$PreferredMode, (i & 128) != 0 ? fVar.f18491h : bVar);
        }

        public /* synthetic */ f(boolean z10, Document document, List list, boolean z11, String str, boolean z12, DocCapture$PreferredMode docCapture$PreferredMode, com.sumsub.sns.internal.ml.badphotos.models.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, document, list, z11, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z12, docCapture$PreferredMode, bVar);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256}, m = "onPrepare$suspendImpl")
    public static final class f0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18492a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18493b;

        /* renamed from: d, reason: collision with root package name */
        public int f18495d;

        public f0(T9.a<? super f0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18493b = obj;
            this.f18495d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.f(SNSPreviewPhotoDocumentViewModel.this, this);
        }
    }

    public static final class g extends a.d {

        /* renamed from: a, reason: collision with root package name */
        public final List<d> f18496a;

        /* renamed from: b, reason: collision with root package name */
        public final k f18497b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f18498c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f18499d;

        /* renamed from: e, reason: collision with root package name */
        public final Content f18500e;

        public g() {
            this(null, null, false, false, null, 31, null);
        }

        public final g a(List<d> list, k kVar, boolean z10, boolean z11, Content content) {
            return new g(list, kVar, z10, z11, content);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.f.b(this.f18496a, gVar.f18496a) && kotlin.jvm.internal.f.b(this.f18497b, gVar.f18497b) && this.f18498c == gVar.f18498c && this.f18499d == gVar.f18499d && kotlin.jvm.internal.f.b(this.f18500e, gVar.f18500e);
        }

        public final Content f() {
            return this.f18500e;
        }

        public final List<d> g() {
            return this.f18496a;
        }

        public final boolean h() {
            return this.f18498c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f18496a.hashCode() * 31;
            k kVar = this.f18497b;
            int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
            boolean z10 = this.f18498c;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode2 + i) * 31;
            boolean z11 = this.f18499d;
            int i10 = (i9 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            Content content = this.f18500e;
            return i10 + (content != null ? content.hashCode() : 0);
        }

        public final boolean i() {
            return this.f18499d;
        }

        public final k j() {
            return this.f18497b;
        }

        public String toString() {
            return "SNSPreviewPhotoDocumentViewState(documents=" + this.f18496a + ", warning=" + this.f18497b + ", rotationAvailable=" + this.f18498c + ", showContent=" + this.f18499d + ", content=" + this.f18500e + ')';
        }

        public g(List<d> list, k kVar, boolean z10, boolean z11, Content content) {
            this.f18496a = list;
            this.f18497b = kVar;
            this.f18498c = z10;
            this.f18499d = z11;
            this.f18500e = content;
        }

        public static /* synthetic */ g a(g gVar, List list, k kVar, boolean z10, boolean z11, Content content, int i, Object obj) {
            if ((i & 1) != 0) {
                list = gVar.f18496a;
            }
            if ((i & 2) != 0) {
                kVar = gVar.f18497b;
            }
            k kVar2 = kVar;
            if ((i & 4) != 0) {
                z10 = gVar.f18498c;
            }
            boolean z12 = z10;
            if ((i & 8) != 0) {
                z11 = gVar.f18499d;
            }
            boolean z13 = z11;
            if ((i & 16) != 0) {
                content = gVar.f18500e;
            }
            return gVar.a(list, kVar2, z12, z13, content);
        }

        public g(List list, k kVar, boolean z10, boolean z11, Content content, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.f23104a : list, (i & 2) != 0 ? null : kVar, (i & 4) != 0 ? false : z10, (i & 8) == 0 ? z11 : false, (i & 16) == 0 ? content : null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onPrepare$2", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256}, m = "invokeSuspend")
    public static final class g0 extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18501a;

        /* renamed from: b, reason: collision with root package name */
        public int f18502b;

        /* renamed from: c, reason: collision with root package name */
        public int f18503c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f18504d;

        public g0(T9.a<? super g0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, T9.a<? super g> aVar) {
            return ((g0) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            g0 g0Var = SNSPreviewPhotoDocumentViewModel.this.new g0(aVar);
            g0Var.f18504d = obj;
            return g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g gVar;
            int i;
            int i9;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i10 = this.f18503c;
            if (i10 == 0) {
                kotlin.b.b(obj);
                gVar = (g) this.f18504d;
                SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = SNSPreviewPhotoDocumentViewModel.this;
                this.f18504d = gVar;
                this.f18501a = 0;
                this.f18502b = 0;
                this.f18503c = 1;
                obj = sNSPreviewPhotoDocumentViewModel.d(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = 0;
                i9 = 0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f18502b;
                i9 = this.f18501a;
                gVar = (g) this.f18504d;
                kotlin.b.b(obj);
            }
            return g.a(gVar, null, null, i9 != 0, i != 0, (Content) obj, 15, null);
        }
    }

    public static final class h implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18506a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18507b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18508c;

        public h(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f18506a = charSequence;
            this.f18507b = charSequence2;
            this.f18508c = charSequence3;
        }

        public final CharSequence d() {
            return this.f18508c;
        }

        public final CharSequence e() {
            return this.f18507b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.f.b(this.f18506a, hVar.f18506a) && kotlin.jvm.internal.f.b(this.f18507b, hVar.f18507b) && kotlin.jvm.internal.f.b(this.f18508c, hVar.f18508c);
        }

        public final CharSequence f() {
            return this.f18506a;
        }

        public int hashCode() {
            CharSequence charSequence = this.f18506a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18507b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18508c;
            return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAnotherSideAction(message=");
            sb2.append((Object) this.f18506a);
            sb2.append(", buttonPositive=");
            sb2.append((Object) this.f18507b);
            sb2.append(", buttonNegative=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f18508c, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onRestartStep$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {1173}, m = "invokeSuspend")
    public static final class h0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18509a;

        public h0(T9.a<? super h0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((h0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new h0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18509a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = SNSPreviewPhotoDocumentViewModel.this;
                this.f18509a = 1;
                if (sNSPreviewPhotoDocumentViewModel.c(true, (T9.a<? super O9.p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    public static final class i implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.domain.model.c f18511a;

        /* renamed from: b, reason: collision with root package name */
        public final Parcelable f18512b;

        public i(com.sumsub.sns.internal.core.domain.model.c cVar, Parcelable parcelable) {
            this.f18511a = cVar;
            this.f18512b = parcelable;
        }

        public final com.sumsub.sns.internal.core.domain.model.c c() {
            return this.f18511a;
        }

        public final Parcelable d() {
            return this.f18512b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.f.b(this.f18511a, iVar.f18511a) && kotlin.jvm.internal.f.b(this.f18512b, iVar.f18512b);
        }

        public int hashCode() {
            int hashCode = this.f18511a.hashCode() * 31;
            Parcelable parcelable = this.f18512b;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "ShowInstructions(introParams=" + this.f18511a + ", payload=" + this.f18512b + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onTakeAnotherDataClicked$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {221}, m = "invokeSuspend")
    public static final class i0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18513a;

        public i0(T9.a<? super i0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((i0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new i0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18513a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = SNSPreviewPhotoDocumentViewModel.this;
                this.f18513a = 1;
                if (sNSPreviewPhotoDocumentViewModel.c(true, (T9.a<? super O9.p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    public static final class j implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final e.a<com.sumsub.sns.internal.ml.badphotos.models.a> f18515a;

        public j(e.a<com.sumsub.sns.internal.ml.badphotos.models.a> aVar) {
            this.f18515a = aVar;
        }

        public final e.a<com.sumsub.sns.internal.ml.badphotos.models.a> b() {
            return this.f18515a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && kotlin.jvm.internal.f.b(this.f18515a, ((j) obj).f18515a);
        }

        public int hashCode() {
            return this.f18515a.hashCode();
        }

        public String toString() {
            return "ShowPhotoAnalyzeDebugInfoAction(debugPhotoQualityResult=" + this.f18515a + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onUploadDocuments$3", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {645, 655}, m = "invokeSuspend")
    public static final class j0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18516a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18518c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f18519d;

        public static final class a extends Lambda implements InterfaceC0646l<Integer, O9.p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SNSPreviewPhotoDocumentViewModel f18520a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel) {
                super(1);
                this.f18520a = sNSPreviewPhotoDocumentViewModel;
            }

            public final void a(int i) {
                this.f18520a.b(i);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ O9.p invoke(Integer num) {
                a(num.intValue());
                return O9.p.f3034a;
            }
        }

        public /* synthetic */ class b extends AdaptedFunctionReference implements InterfaceC0650p<Exception, T9.a<? super O9.p>, Object> {
            public b(Object obj) {
                super(2, obj, SNSPreviewPhotoDocumentViewModel.class, "onDocumentsUploadedError", "onDocumentsUploadedError(Ljava/lang/Exception;)V", 4);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Exception exc, T9.a<? super O9.p> aVar) {
                return j0.b((SNSPreviewPhotoDocumentViewModel) this.receiver, exc, aVar);
            }
        }

        public /* synthetic */ class c extends FunctionReferenceImpl implements InterfaceC0650p<List<? extends com.sumsub.sns.internal.core.data.model.remote.k>, T9.a<? super O9.p>, Object> {
            public c(Object obj) {
                super(2, obj, SNSPreviewPhotoDocumentViewModel.class, "onDocumentsUploadedSuccess", "onDocumentsUploadedSuccess(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List<com.sumsub.sns.internal.core.data.model.remote.k> list, T9.a<? super O9.p> aVar) {
                return ((SNSPreviewPhotoDocumentViewModel) this.receiver).a(list, aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(boolean z10, boolean z11, T9.a<? super j0> aVar) {
            super(2, aVar);
            this.f18518c = z10;
            this.f18519d = z11;
        }

        public static final /* synthetic */ Object b(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, Exception exc, T9.a aVar) {
            sNSPreviewPhotoDocumentViewModel.a(exc);
            return O9.p.f3034a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new j0(this.f18518c, this.f18519d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18516a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPreviewPhotoDocumentViewModel.this.f18422D.a(new a(SNSPreviewPhotoDocumentViewModel.this));
                com.sumsub.sns.internal.domain.o oVar = SNSPreviewPhotoDocumentViewModel.this.f18422D;
                o.a aVar = new o.a(SNSPreviewPhotoDocumentViewModel.this.u(), SNSPreviewPhotoDocumentViewModel.this.s(), SNSPreviewPhotoDocumentViewModel.this.F(), this.f18518c, this.f18519d);
                this.f18516a = 1;
                obj = oVar.a((com.sumsub.sns.internal.domain.o) aVar, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends List<com.sumsub.sns.internal.core.data.model.remote.k>>>) this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return O9.p.f3034a;
                }
                kotlin.b.b(obj);
            }
            b bVar = new b(SNSPreviewPhotoDocumentViewModel.this);
            c cVar = new c(SNSPreviewPhotoDocumentViewModel.this);
            this.f18516a = 2;
            if (com.sumsub.sns.internal.core.domain.base.c.a((com.sumsub.sns.internal.core.domain.model.a) obj, bVar, cVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return O9.p.f3034a;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((j0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {813}, m = "prepareAvailableDocuments")
    public static final class k0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18527a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18528b;

        /* renamed from: d, reason: collision with root package name */
        public int f18530d;

        public k0(T9.a<? super k0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18528b = obj;
            this.f18530d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.f(this);
        }
    }

    public /* synthetic */ class l {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18531a;

        static {
            int[] iArr = new int[SNSPreviewIdentityDocumentViewModel.DocumentSideness.values().length];
            iArr[SNSPreviewIdentityDocumentViewModel.DocumentSideness.DOUBLE.ordinal()] = 1;
            iArr[SNSPreviewIdentityDocumentViewModel.DocumentSideness.SINGLE.ordinal()] = 2;
            f18531a = iArr;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {1017}, m = "preparePickerRequest$suspendImpl")
    public static final class l0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18532a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18533b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18534c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18535d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f18536e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f18537f;

        /* renamed from: h, reason: collision with root package name */
        public int f18539h;

        public l0(T9.a<? super l0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18537f = obj;
            this.f18539h |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.a(SNSPreviewPhotoDocumentViewModel.this, false, (com.sumsub.sns.internal.core.data.model.g) null, (T9.a) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {836}, m = "analyzePhoto")
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18540a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18541b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18542c;

        /* renamed from: e, reason: collision with root package name */
        public int f18544e;

        public m(T9.a<? super m> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18542c = obj;
            this.f18544e |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.a((Bitmap) null, (IdentitySide) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {1039}, m = "preparePickerRequestSides")
    public static final class m0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18545a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18546b;

        /* renamed from: d, reason: collision with root package name */
        public int f18548d;

        public m0(T9.a<? super m0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18546b = obj;
            this.f18548d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.g(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {566}, m = "checkQuality")
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18549a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18550b;

        /* renamed from: d, reason: collision with root package name */
        public int f18552d;

        public n(T9.a<? super n> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18550b = obj;
            this.f18552d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.a((Bitmap) null, (com.sumsub.sns.internal.ml.badphotos.models.b) null, (IdentitySide) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$removePickedFiles$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class n0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18553a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<File> f18554b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n0(List<? extends File> list, T9.a<? super n0> aVar) {
            super(2, aVar);
            this.f18554b = list;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((n0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new n0(this.f18554b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18553a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            for (File file : this.f18554b) {
                boolean delete = file.delete();
                com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "deleting " + file.getAbsolutePath() + " success=" + delete, null, 4, null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$checkQuality$photoQualityCheck$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {566}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements InterfaceC0646l<T9.a<? super e.a<com.sumsub.sns.internal.ml.badphotos.models.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18555a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f18557c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ IdentitySide f18558d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Bitmap bitmap, IdentitySide identitySide, T9.a<? super o> aVar) {
            super(1, aVar);
            this.f18557c = bitmap;
            this.f18558d = identitySide;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super e.a<com.sumsub.sns.internal.ml.badphotos.models.a>> aVar) {
            return ((o) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new o(this.f18557c, this.f18558d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18555a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = SNSPreviewPhotoDocumentViewModel.this;
                Bitmap bitmap = this.f18557c;
                IdentitySide identitySide = this.f18558d;
                this.f18555a = 1;
                obj = sNSPreviewPhotoDocumentViewModel.a(bitmap, identitySide, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$sendLog$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class o0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18559a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18560b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18561c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Exception f18562d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str, Exception exc, T9.a<? super o0> aVar) {
            super(2, aVar);
            this.f18561c = str;
            this.f18562d = exc;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((o0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            o0 o0Var = new o0(this.f18561c, this.f18562d, aVar);
            o0Var.f18560b = obj;
            return o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18559a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).e(com.sumsub.sns.internal.log.c.a((CoroutineScope) this.f18560b), this.f18561c, this.f18562d);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {526}, m = "decodeImage")
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18563a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18564b;

        /* renamed from: d, reason: collision with root package name */
        public int f18566d;

        public p(T9.a<? super p> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18564b = obj;
            this.f18566d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.a((com.sumsub.sns.internal.core.data.model.n) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$showContent$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class p0 extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18567a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18568b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(boolean z10, T9.a<? super p0> aVar) {
            super(2, aVar);
            this.f18569c = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, T9.a<? super g> aVar) {
            return ((p0) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            p0 p0Var = new p0(this.f18569c, aVar);
            p0Var.f18568b = obj;
            return p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18567a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return g.a((g) this.f18568b, null, null, false, this.f18569c, null, 23, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {537}, m = "decodePdf")
    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18570a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18571b;

        /* renamed from: d, reason: collision with root package name */
        public int f18573d;

        public q(T9.a<? super q> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18571b = obj;
            this.f18573d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.b((com.sumsub.sns.internal.core.data.model.n) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {954, 966}, m = "showPhotoPicker")
    public static final class q0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18574a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18575b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18576c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f18577d;

        /* renamed from: f, reason: collision with root package name */
        public int f18579f;

        public q0(T9.a<? super q0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18577d = obj;
            this.f18579f |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.c(false, (T9.a<? super O9.p>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$decodePdf$2", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class r extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18580a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18581b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f18582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Throwable th, T9.a<? super r> aVar) {
            super(2, aVar);
            this.f18582c = th;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((r) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            r rVar = new r(this.f18582c, aVar);
            rVar.f18581b = obj;
            return rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18580a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).e(com.sumsub.sns.internal.log.c.a((CoroutineScope) this.f18581b), "Can't decode PDF", this.f18582c);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$showPhotoPicker$2", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class r0 extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18583a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18584b;

        public r0(T9.a<? super r0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, T9.a<? super g> aVar) {
            return ((r0) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            r0 r0Var = new r0(aVar);
            r0Var.f18584b = obj;
            return r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18583a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return g.a((g) this.f18584b, null, null, false, false, null, 23, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {1076}, m = "documentSideness")
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18585a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18586b;

        /* renamed from: d, reason: collision with root package name */
        public int f18588d;

        public s(T9.a<? super s> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18586b = obj;
            this.f18588d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.a(false, (T9.a<? super SNSPreviewIdentityDocumentViewModel.DocumentSideness>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$showResultsPreview$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {436, 440, 457, 460, 477, 481, 514}, m = "invokeSuspend")
    public static final class s0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18589a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18590b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18591c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18592d;

        /* renamed from: e, reason: collision with root package name */
        public Object f18593e;

        /* renamed from: f, reason: collision with root package name */
        public Object f18594f;

        /* renamed from: g, reason: collision with root package name */
        public Object f18595g;

        /* renamed from: h, reason: collision with root package name */
        public Object f18596h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f18597j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f18598k;

        /* renamed from: l, reason: collision with root package name */
        public int f18599l;

        /* renamed from: m, reason: collision with root package name */
        public int f18600m;

        /* renamed from: n, reason: collision with root package name */
        public int f18601n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List<com.sumsub.sns.internal.core.data.model.n> f18603p;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$showResultsPreview$1$2", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18604a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f18605b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18605b = gVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g gVar, T9.a<? super g> aVar) {
                return ((a) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f18605b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f18604a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return g.a(this.f18605b, null, null, false, true, null, 23, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(List<com.sumsub.sns.internal.core.data.model.n> list, T9.a<? super s0> aVar) {
            super(2, aVar);
            this.f18603p = list;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((s0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new s0(this.f18603p, aVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0347, code lost:
        
            if (r3 != null) goto L101;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x027b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0418  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0295  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0473  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x046e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0304  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x046c  */
        /* JADX WARN: Type inference failed for: r3v50, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v6, types: [T, java.util.LinkedHashMap] */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, java.util.LinkedHashMap] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0279 -> B:74:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0347 -> B:19:0x0367). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0362 -> B:18:0x0365). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01df -> B:79:0x0151). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01f3 -> B:79:0x0151). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 1188
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.s0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {861, 862, 865, 869}, m = "getContent")
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18606a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18607b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18608c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18609d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f18610e;

        /* renamed from: g, reason: collision with root package name */
        public int f18612g;

        public t(T9.a<? super t> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18610e = obj;
            this.f18612g |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {300, 301, 302}, m = "showSecondSidePrompt")
    public static final class t0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18613a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18614b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18615c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f18616d;

        /* renamed from: f, reason: collision with root package name */
        public int f18618f;

        public t0(T9.a<? super t0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18616d = obj;
            this.f18618f |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.h(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {879, 885, 886, 893, 899, 909, 913}, m = "getContent")
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18619a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18620b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18621c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18622d;

        /* renamed from: e, reason: collision with root package name */
        public float f18623e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f18624f;

        /* renamed from: h, reason: collision with root package name */
        public int f18626h;

        public u(T9.a<? super u> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18624f = obj;
            this.f18626h |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.a((IdentitySide) null, (e.a<com.sumsub.sns.internal.ml.badphotos.models.a>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$showUploadingState$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {676}, m = "invokeSuspend")
    public static final class u0 extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18627a;

        /* renamed from: b, reason: collision with root package name */
        public int f18628b;

        /* renamed from: c, reason: collision with root package name */
        public int f18629c;

        /* renamed from: d, reason: collision with root package name */
        public int f18630d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f18631e;

        public u0(T9.a<? super u0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, T9.a<? super g> aVar) {
            return ((u0) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            u0 u0Var = SNSPreviewPhotoDocumentViewModel.this.new u0(aVar);
            u0Var.f18631e = obj;
            return u0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Content content;
            boolean z10;
            boolean z11;
            g gVar;
            Object a10;
            boolean z12;
            g gVar2;
            Content content2;
            boolean z13;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18630d;
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar3 = (g) this.f18631e;
                Content f10 = gVar3.f();
                if (f10 == null) {
                    content = null;
                    z10 = false;
                    z11 = false;
                    gVar = gVar3;
                    return g.a(gVar, null, null, z10, z11, content, 15, null);
                }
                SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = SNSPreviewPhotoDocumentViewModel.this;
                this.f18631e = gVar3;
                this.f18627a = f10;
                this.f18628b = 0;
                this.f18629c = 0;
                this.f18630d = 1;
                a10 = sNSPreviewPhotoDocumentViewModel.a("sns_preview_uploading_title", this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z12 = false;
                gVar2 = gVar3;
                content2 = f10;
                z13 = false;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = this.f18629c;
                int i10 = this.f18628b;
                Content content3 = (Content) this.f18627a;
                g gVar4 = (g) this.f18631e;
                kotlin.b.b(obj);
                gVar2 = gVar4;
                content2 = content3;
                a10 = obj;
                z12 = i9;
                z13 = i10;
            }
            String str = (String) a10;
            if (str == null) {
                str = " ";
            }
            z11 = z12;
            z10 = z13;
            content = Content.a(content2, null, null, null, null, null, null, new Content.b(str, 0), 63, null);
            gVar = gVar2;
            return g.a(gVar, null, null, z10, z11, content, 15, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {1097}, m = "idDocList")
    public static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18633a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18634b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18635c;

        /* renamed from: e, reason: collision with root package name */
        public int f18637e;

        public v(T9.a<? super v> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18635c = obj;
            this.f18637e |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.b((String) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$updateLoadingProgress$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class v0 extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18638a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18639b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(int i, T9.a<? super v0> aVar) {
            super(2, aVar);
            this.f18640c = i;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, T9.a<? super g> aVar) {
            return ((v0) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            v0 v0Var = new v0(this.f18640c, aVar);
            v0Var.f18639b = obj;
            return v0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18638a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            g gVar = (g) this.f18639b;
            Content f10 = gVar.f();
            Content content = null;
            if (f10 != null) {
                Content.b k3 = gVar.f().k();
                content = Content.a(f10, null, null, null, null, null, null, k3 != null ? Content.b.a(k3, null, this.f18640c, 1, null) : null, 63, null);
            }
            return g.a(gVar, null, null, false, false, content, 15, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDataIsReadableClicked$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {NamedGroup.ffdhe3072, 263}, m = "invokeSuspend")
    public static final class w extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18641a;

        public w(T9.a<? super w> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((w) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new w(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18641a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSEventHandler eventHandler = com.sumsub.sns.internal.core.common.e0.f15081a.getEventHandler();
                if (eventHandler != null) {
                    eventHandler.onEvent(new SNSEvent.PhotoAccepted(SNSPreviewPhotoDocumentViewModel.this.u().getType().c()));
                }
                SNSPreviewPhotoDocumentViewModel.this.z();
                com.sumsub.sns.internal.core.data.source.dynamic.b t3 = SNSPreviewPhotoDocumentViewModel.this.t();
                this.f18641a = 1;
                obj = com.sumsub.sns.internal.core.data.source.dynamic.b.e(t3, false, this, 1, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return O9.p.f3034a;
                }
                kotlin.b.b(obj);
            }
            com.sumsub.sns.internal.core.data.model.g gVar = (com.sumsub.sns.internal.core.data.model.g) ((com.sumsub.sns.internal.core.data.source.dynamic.e) obj).d();
            g.c.a a10 = gVar != null ? gVar.a(SNSPreviewPhotoDocumentViewModel.this.u().getType()) : null;
            if ((a10 == null || !a10.w()) && (a10 == null || !a10.v())) {
                com.sumsub.sns.internal.core.data.model.l B10 = SNSPreviewPhotoDocumentViewModel.this.B();
                if (B10 != null && B10.d()) {
                    SNSPreviewPhotoDocumentViewModel.this.M();
                } else if (SNSPreviewPhotoDocumentViewModel.this.I() == IdentitySide.Front) {
                    SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = SNSPreviewPhotoDocumentViewModel.this;
                    this.f18641a = 2;
                    if (SNSPreviewPhotoDocumentViewModel.b(sNSPreviewPhotoDocumentViewModel, false, this, 1, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (SNSPreviewPhotoDocumentViewModel.this.I() == IdentitySide.Back) {
                    SNSPreviewPhotoDocumentViewModel.this.M();
                }
            } else {
                SNSPreviewPhotoDocumentViewModel.this.M();
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {200}, m = "updateSeamlessMode")
    public static final class w0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18643a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18644b;

        /* renamed from: d, reason: collision with root package name */
        public int f18646d;

        public w0(T9.a<? super w0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18644b = obj;
            this.f18646d |= Integer.MIN_VALUE;
            return SNSPreviewPhotoDocumentViewModel.this.i(this);
        }
    }

    public static final class x extends Lambda implements InterfaceC0646l<com.sumsub.sns.internal.core.data.model.n, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.model.n f18647a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(com.sumsub.sns.internal.core.data.model.n nVar) {
            super(1);
            this.f18647a = nVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(com.sumsub.sns.internal.core.data.model.n nVar) {
            return Boolean.valueOf(nVar.o() == this.f18647a.o());
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDocumentSideAnswerClicked$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {235}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18648a;

        public y(T9.a<? super y> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((y) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewPhotoDocumentViewModel.this.new y(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18648a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = SNSPreviewPhotoDocumentViewModel.this;
                this.f18648a = 1;
                if (sNSPreviewPhotoDocumentViewModel.c(false, (T9.a<? super O9.p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDocumentsPicked$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class z extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18650a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.model.l f18651b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSPreviewPhotoDocumentViewModel f18652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(com.sumsub.sns.internal.core.data.model.l lVar, SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, T9.a<? super z> aVar) {
            super(2, aVar);
            this.f18651b = lVar;
            this.f18652c = sNSPreviewPhotoDocumentViewModel;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((z) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new z(this.f18651b, this.f18652c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.sumsub.sns.internal.core.data.model.n a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18650a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            for (com.sumsub.sns.internal.core.data.model.n nVar : this.f18651b.c()) {
                com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "result: " + nVar, null, 4, null);
            }
            SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel = this.f18652c;
            List<com.sumsub.sns.internal.core.data.model.n> c2 = this.f18651b.c();
            SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel2 = this.f18652c;
            ArrayList arrayList = new ArrayList(P9.n.u(c2, 10));
            for (com.sumsub.sns.internal.core.data.model.n nVar2 : c2) {
                String v10 = sNSPreviewPhotoDocumentViewModel2.v();
                if (!(!kotlin.jvm.internal.f.b(nVar2.p(), "IDENTITY_VIDEO"))) {
                    v10 = null;
                }
                a10 = nVar2.a((r20 & 1) != 0 ? nVar2.f15522a : null, (r20 & 2) != 0 ? nVar2.f15523b : null, (r20 & 4) != 0 ? nVar2.f15524c : null, (r20 & 8) != 0 ? nVar2.f15525d : v10 == null ? "IDENTITY_VIDEO" : v10, (r20 & 16) != 0 ? nVar2.f15526e : null, (r20 & 32) != 0 ? nVar2.f15527f : false, (r20 & 64) != 0 ? nVar2.f15528g : null, (r20 & 128) != 0 ? nVar2.f15529h : null, (r20 & 256) != 0 ? nVar2.i : false);
                arrayList.add(a10);
            }
            sNSPreviewPhotoDocumentViewModel.a(arrayList);
            this.f18652c.b(IdentitySide.Front);
            this.f18652c.c(this.f18651b.c());
            SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel3 = this.f18652c;
            List<com.sumsub.sns.internal.core.data.model.n> F10 = sNSPreviewPhotoDocumentViewModel3.F();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : F10) {
                if (!kotlin.jvm.internal.f.b(((com.sumsub.sns.internal.core.data.model.n) obj2).p(), "IDENTITY_VIDEO")) {
                    arrayList2.add(obj2);
                }
            }
            sNSPreviewPhotoDocumentViewModel3.b(arrayList2);
            return O9.p.f3034a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SNSPreviewPhotoDocumentViewModel.class, "side", "getSide()Lcom/sumsub/sns/internal/core/data/model/IdentitySide;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(SNSPreviewPhotoDocumentViewModel.class, "compositePickerResults", "getCompositePickerResults()Lcom/sumsub/sns/internal/core/data/model/CompositeDocumentPickerResult;", 0);
        iVar.getClass();
        f18420O = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, C.v.t(SNSPreviewPhotoDocumentViewModel.class, "pickerResults", "getPickerResults()Ljava/util/List;", 0, iVar), C.v.t(SNSPreviewPhotoDocumentViewModel.class, "showPhotoPickerOnStart", "getShowPhotoPickerOnStart()Z", 0, iVar), C.v.t(SNSPreviewPhotoDocumentViewModel.class, "checkPhotoQualityResultMap", "getCheckPhotoQualityResultMap()Ljava/util/Map;", 0, iVar), C.v.t(SNSPreviewPhotoDocumentViewModel.class, "documentProperties", "getDocumentProperties()Ljava/util/Map;", 0, iVar), C.v.t(SNSPreviewPhotoDocumentViewModel.class, "isSeamlessMode", "isSeamlessMode()Z", 0, iVar)};
        f18419N = new a(null);
    }

    public SNSPreviewPhotoDocumentViewModel(Document document, G g10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.core.data.source.extensions.a aVar2, com.sumsub.sns.internal.domain.o oVar, com.sumsub.sns.internal.core.common.o0 o0Var, com.sumsub.sns.internal.ml.core.e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> eVar, com.sumsub.sns.internal.core.domain.b bVar2) {
        super(document, g10, aVar, bVar, bVar2);
        this.f18421C = aVar2;
        this.f18422D = oVar;
        this.f18423E = o0Var;
        this.f18424F = eVar;
        IdentitySide identitySide = IdentitySide.Front;
        this.f18425G = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_IDENTITY_SIDE", identitySide);
        this.f18426H = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_COMPOSITE_RESULTS", null);
        this.f18427I = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_RESULTS", EmptyList.f23104a);
        this.f18428J = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "showPhotoPickerOnStart", Boolean.TRUE);
        this.f18429K = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "analyticsPayload", P9.z.o(new Pair(identitySide.getValue(), new com.sumsub.sns.internal.ml.badphotos.models.b(null, null, null, null, null, null, null, null, null, 511, null))));
        this.f18430L = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "documentProperties", kotlin.collections.a.p());
        this.f18431M = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "isSeamlessMode", Boolean.FALSE);
    }

    public final Map<String, com.sumsub.sns.internal.ml.badphotos.models.b> A() {
        return (Map) this.f18429K.a(this, f18420O[4]);
    }

    public final com.sumsub.sns.internal.core.data.model.l B() {
        return (com.sumsub.sns.internal.core.data.model.l) this.f18426H.a(this, f18420O[1]);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public g e() {
        return new g(null, null, false, false, null, 31, null);
    }

    public final Map<String, b> D() {
        return (Map) this.f18430L.a(this, f18420O[5]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.b(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> E() {
        /*
            r8 = this;
            com.sumsub.sns.internal.core.data.model.IdentitySide r0 = r8.I()
            boolean r1 = r8.J()
            if (r1 == 0) goto Lc
            com.sumsub.sns.internal.core.data.model.IdentitySide r0 = com.sumsub.sns.internal.core.data.model.IdentitySide.Front
        Lc:
            java.util.Map r1 = r8.A()
            java.lang.String r2 = r0.getValue()
            java.lang.Object r1 = r1.get(r2)
            com.sumsub.sns.internal.ml.badphotos.models.b r1 = (com.sumsub.sns.internal.ml.badphotos.models.b) r1
            if (r1 == 0) goto Lc0
            java.util.Map r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.a(r1)
            if (r1 == 0) goto Lc0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            com.sumsub.sns.internal.core.data.model.l r1 = r8.B()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L37
            boolean r1 = r1.d()
            if (r1 != r4) goto L37
            r1 = r4
            goto L38
        L37:
            r1 = r3
        L38:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r5 = "isSeamless"
            r2.put(r5, r1)
            java.util.Map r1 = r8.A()
            com.sumsub.sns.internal.core.data.model.IdentitySide r5 = com.sumsub.sns.internal.core.data.model.IdentitySide.Back
            java.lang.String r5 = r5.getValue()
            java.lang.Object r1 = r1.get(r5)
            com.sumsub.sns.internal.ml.badphotos.models.b r1 = (com.sumsub.sns.internal.ml.badphotos.models.b) r1
            if (r1 == 0) goto L5c
            java.util.Map r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.a(r1)
            java.lang.String r5 = "backSide"
            r2.put(r5, r1)
        L5c:
            java.util.List r1 = r8.F()
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r5 = r1.hasNext()
            r6 = 0
            if (r5 == 0) goto L79
            java.lang.Object r5 = r1.next()
            r7 = r5
            com.sumsub.sns.internal.core.data.model.n r7 = (com.sumsub.sns.internal.core.data.model.n) r7
            boolean r7 = r7.t()
            if (r7 == 0) goto L64
            goto L7a
        L79:
            r5 = r6
        L7a:
            com.sumsub.sns.internal.core.data.model.n r5 = (com.sumsub.sns.internal.core.data.model.n) r5
            if (r5 == 0) goto L8f
            com.sumsub.sns.internal.core.data.model.n$b r1 = r5.q()
            if (r1 == 0) goto L8f
            java.util.Map r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.a(r1)
            if (r1 == 0) goto L8f
            java.lang.String r5 = "seamlessVideo"
            r2.put(r5, r1)
        L8f:
            java.util.List r1 = r8.F()
            java.util.Iterator r1 = r1.iterator()
        L97:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lab
            java.lang.Object r5 = r1.next()
            r7 = r5
            com.sumsub.sns.internal.core.data.model.n r7 = (com.sumsub.sns.internal.core.data.model.n) r7
            com.sumsub.sns.internal.core.data.model.IdentitySide r7 = r7.o()
            if (r7 != r0) goto L97
            r6 = r5
        Lab:
            com.sumsub.sns.internal.core.data.model.n r6 = (com.sumsub.sns.internal.core.data.model.n) r6
            if (r6 == 0) goto Lb6
            boolean r0 = r6.s()
            if (r0 != r4) goto Lb6
            r3 = r4
        Lb6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "isFromGallery"
            r2.put(r1, r0)
            return r2
        Lc0:
            java.util.Map r0 = kotlin.collections.a.p()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.E():java.util.Map");
    }

    public final List<com.sumsub.sns.internal.core.data.model.n> F() {
        return (List) this.f18427I.a(this, f18420O[2]);
    }

    public final boolean G() {
        com.sumsub.sns.internal.core.data.model.e d10 = d();
        if (d10 != null) {
            return com.sumsub.sns.internal.core.data.model.f.d(d10, u().getType().c());
        }
        return false;
    }

    public final boolean H() {
        return ((Boolean) this.f18428J.a(this, f18420O[3])).booleanValue();
    }

    public final IdentitySide I() {
        return (IdentitySide) this.f18425G.a(this, f18420O[0]);
    }

    public final boolean J() {
        return ((Boolean) this.f18431M.a(this, f18420O[6])).booleanValue();
    }

    public final void K() {
        P();
    }

    public void L() {
        Q();
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new h0(null), 3, null);
    }

    public final void M() {
        boolean z10;
        com.sumsub.sns.internal.core.data.model.n a10;
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onUploadDocuments", null, 4, null);
        R();
        boolean z11 = false;
        if (F().isEmpty()) {
            com.sumsub.sns.core.presentation.base.a.a(this, new q.b(false), (Object) null, (Long) null, 6, (Object) null);
            return;
        }
        List<com.sumsub.sns.internal.core.data.model.n> F10 = F();
        ArrayList arrayList = new ArrayList();
        for (Object obj : F10) {
            if (true ^ ((com.sumsub.sns.internal.core.data.model.n) obj).t()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            List<com.sumsub.sns.internal.core.data.model.n> F11 = F();
            if (!(F11 instanceof Collection) || !F11.isEmpty()) {
                Iterator<T> it = F11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((com.sumsub.sns.internal.core.data.model.n) it.next()).o() != null) {
                        List<com.sumsub.sns.internal.core.data.model.n> F12 = F();
                        ArrayList arrayList2 = new ArrayList(P9.n.u(F12, 10));
                        Iterator<T> it2 = F12.iterator();
                        while (it2.hasNext()) {
                            a10 = r7.a((r20 & 1) != 0 ? r7.f15522a : null, (r20 & 2) != 0 ? r7.f15523b : null, (r20 & 4) != 0 ? r7.f15524c : null, (r20 & 8) != 0 ? r7.f15525d : null, (r20 & 16) != 0 ? r7.f15526e : null, (r20 & 32) != 0 ? r7.f15527f : false, (r20 & 64) != 0 ? r7.f15528g : null, (r20 & 128) != 0 ? r7.f15529h : null, (r20 & 256) != 0 ? ((com.sumsub.sns.internal.core.data.model.n) it2.next()).i : false);
                            arrayList2.add(a10);
                        }
                        a(new ArrayList(arrayList2));
                    }
                }
            }
        }
        if (J()) {
            List<com.sumsub.sns.internal.core.data.model.n> F13 = F();
            if (!(F13 instanceof Collection) || !F13.isEmpty()) {
                Iterator<T> it3 = F13.iterator();
                while (it3.hasNext()) {
                    if (((com.sumsub.sns.internal.core.data.model.n) it3.next()).t()) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        z10 = true;
        List<com.sumsub.sns.internal.core.data.model.n> F14 = F();
        if (!(F14 instanceof Collection) || !F14.isEmpty()) {
            Iterator<T> it4 = F14.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                com.sumsub.sns.internal.core.data.model.n nVar = (com.sumsub.sns.internal.core.data.model.n) it4.next();
                if (nVar.n() && nVar.o() == IdentitySide.Front) {
                    z11 = true;
                    break;
                }
            }
        }
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "uploading docs, parallel=" + z10, null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new j0(z10, z11, null), 3, null);
    }

    public void N() {
        L();
    }

    public final void O() {
        a(u());
    }

    public final void P() {
        List<com.sumsub.sns.internal.core.data.model.n> F10 = F();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = F10.iterator();
        while (it.hasNext()) {
            File m2 = ((com.sumsub.sns.internal.core.data.model.n) it.next()).m();
            if (m2 != null) {
                arrayList.add(m2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "deleting " + arrayList.size() + " files", null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new n0(arrayList, null), 2, null);
    }

    public final void Q() {
        a(IdentitySide.Front);
        ArrayList arrayList = new ArrayList(F());
        arrayList.clear();
        a(arrayList);
    }

    public final void R() {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new u0(null), 1, null);
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public Object a(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super O9.p> aVar) {
        return a(this, gVar, eVar, (T9.a) aVar);
    }

    public Object b(boolean z10, T9.a<? super O9.p> aVar) {
        return a(this, z10, aVar);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super O9.p> aVar) {
        return f(this, aVar);
    }

    public Object e(T9.a<? super CharSequence> aVar) {
        return e(this, aVar);
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a, com.sumsub.sns.core.presentation.base.a
    public void m() {
        if (!F().isEmpty()) {
            b(F());
        } else {
            super.m();
        }
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public void p() {
        P();
    }

    public void x() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onDataIsReadableClicked", null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new w(null), 3, null);
    }

    public void y() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onTakeAnotherDataClicked", null, 4, null);
        SNSEventHandler eventHandler = com.sumsub.sns.internal.core.common.e0.f15081a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new SNSEvent.PhotoDeclined(u().getType().c()));
        }
        com.sumsub.sns.internal.core.data.model.l B10 = B();
        if (B10 != null && B10.d()) {
            a(EmptyList.f23104a);
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new i0(null), 3, null);
    }

    public final void z() {
        String b9;
        String b10;
        String b11;
        List<com.sumsub.sns.internal.core.data.model.n> F10 = F();
        ArrayList arrayList = new ArrayList();
        for (Object obj : F10) {
            b11 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.b((com.sumsub.sns.internal.core.data.model.n) obj);
            if (b11 != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Map<String, b> D2 = D();
            b10 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.b((com.sumsub.sns.internal.core.data.model.n) next);
            if (b10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (D2.containsKey(b10)) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            com.sumsub.sns.internal.core.data.model.n nVar = (com.sumsub.sns.internal.core.data.model.n) it2.next();
            Map<String, b> D10 = D();
            b9 = com.sumsub.sns.internal.presentation.screen.preview.photo.a.b(nVar);
            if (b9 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            b bVar = D10.get(b9);
            if (bVar == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            a(nVar, bVar.b());
        }
    }

    public Object a(boolean z10, com.sumsub.sns.internal.core.data.model.g gVar, T9.a<? super f> aVar) {
        return a(this, z10, gVar, aVar);
    }

    public final void f(boolean z10) {
        this.f18428J.a(this, f18420O[3], Boolean.valueOf(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(T9.a<? super java.util.List<? extends com.sumsub.sns.internal.core.data.model.IdentitySide>> r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.g(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(T9.a<? super O9.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.t0
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$t0 r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.t0) r0
            int r1 = r0.f18618f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18618f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$t0 r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$t0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18616d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18618f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L61
            if (r2 == r5) goto L55
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r1 = r0.f18615c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r2 = r0.f18614b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r0 = r0.f18613a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r0
            kotlin.b.b(r8)
            goto La2
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L42:
            java.lang.Object r2 = r0.f18615c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f18614b
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r4 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r4
            java.lang.Object r5 = r0.f18613a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r5 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r5
            kotlin.b.b(r8)
            r6 = r4
            r4 = r2
            r2 = r6
            goto L8b
        L55:
            java.lang.Object r2 = r0.f18614b
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r2 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r2
            java.lang.Object r5 = r0.f18613a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r5 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r5
            kotlin.b.b(r8)
            goto L75
        L61:
            kotlin.b.b(r8)
            r0.f18613a = r7
            r0.f18614b = r7
            r0.f18618f = r5
            java.lang.String r8 = "sns_prompt_doubleSide_text"
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            r2 = r7
            r5 = r2
        L75:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r0.f18613a = r5
            r0.f18614b = r2
            r0.f18615c = r8
            r0.f18618f = r4
            java.lang.String r4 = "sns_prompt_doubleSide_action_yes"
            java.lang.Object r4 = r5.a(r4, r0)
            if (r4 != r1) goto L88
            return r1
        L88:
            r6 = r4
            r4 = r8
            r8 = r6
        L8b:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r0.f18613a = r2
            r0.f18614b = r4
            r0.f18615c = r8
            r0.f18618f = r3
            java.lang.String r3 = "sns_prompt_doubleSide_action_no"
            java.lang.Object r0 = r5.a(r3, r0)
            if (r0 != r1) goto L9e
            return r1
        L9e:
            r1 = r8
            r8 = r0
            r0 = r2
            r2 = r4
        La2:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$h r3 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$h
            r3.<init>(r2, r1, r8)
            r0.a(r3)
            O9.p r8 = O9.p.f3034a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.h(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(T9.a<? super O9.p> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.w0
            if (r0 == 0) goto L13
            r0 = r12
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$w0 r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.w0) r0
            int r1 = r0.f18646d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18646d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$w0 r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$w0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f18644b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18646d
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            java.lang.Object r0 = r0.f18643a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r0
            kotlin.b.b(r12)
            goto L48
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            kotlin.b.b(r12)
            com.sumsub.sns.internal.core.data.source.dynamic.b r12 = r11.t()
            r0.f18643a = r11
            r0.f18646d = r5
            java.lang.Object r12 = com.sumsub.sns.internal.core.data.source.dynamic.b.e(r12, r4, r0, r5, r3)
            if (r12 != r1) goto L47
            return r1
        L47:
            r0 = r11
        L48:
            com.sumsub.sns.internal.core.data.source.dynamic.e r12 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r12
            java.lang.Object r12 = r12.d()
            com.sumsub.sns.internal.core.data.model.g r12 = (com.sumsub.sns.internal.core.data.model.g) r12
            if (r12 == 0) goto La6
            com.sumsub.sns.internal.core.data.model.g$c r12 = r12.I()
            java.util.List r12 = r12.g()
            java.util.Iterator r12 = r12.iterator()
        L5e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r12.next()
            r2 = r1
            com.sumsub.sns.internal.core.data.model.g$c$a r2 = (com.sumsub.sns.internal.core.data.model.g.c.a) r2
            com.sumsub.sns.internal.core.data.model.DocumentType r2 = r2.m()
            com.sumsub.sns.internal.core.data.model.Document r6 = r0.u()
            com.sumsub.sns.internal.core.data.model.DocumentType r6 = r6.getType()
            boolean r2 = kotlin.jvm.internal.f.b(r2, r6)
            if (r2 == 0) goto L5e
            r3 = r1
        L7e:
            com.sumsub.sns.internal.core.data.model.g$c$a r3 = (com.sumsub.sns.internal.core.data.model.g.c.a) r3
            if (r3 == 0) goto La6
            com.sumsub.sns.internal.core.data.model.Document r12 = r0.u()
            com.sumsub.sns.internal.core.data.model.DocumentType r12 = r12.getType()
            boolean r12 = r12.g()
            if (r12 == 0) goto La3
            boolean r12 = r3.u()
            if (r12 == 0) goto La3
            com.sumsub.sns.internal.ff.a r12 = com.sumsub.sns.internal.ff.a.f16930a
            com.sumsub.sns.internal.ff.core.a r12 = r12.e()
            boolean r12 = r12.g()
            if (r12 != 0) goto La3
            r4 = r5
        La3:
            r0.e(r4)
        La6:
            com.sumsub.sns.internal.camera.photo.presentation.document.b r5 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "isSeamlessMode="
            r12.<init>(r1)
            boolean r0 = r0.J()
            r12.append(r0)
            java.lang.String r7 = r12.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "DocCapture"
            r8 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(r5, r6, r7, r8, r9, r10)
            O9.p r12 = O9.p.f3034a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.i(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r5, T9.a r6) {
        /*
            boolean r0 = r6 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.f0
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$f0 r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.f0) r0
            int r1 = r0.f18495d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18495d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$f0 r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$f0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18493b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18495d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f18492a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r5 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r5
            kotlin.b.b(r6)
            goto L57
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.f18492a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r5 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r5
            kotlin.b.b(r6)
            goto L4c
        L3e:
            kotlin.b.b(r6)
            r0.f18492a = r5
            r0.f18495d = r4
            java.lang.Object r6 = super.c(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0.f18492a = r5
            r0.f18495d = r3
            java.lang.Object r6 = r5.i(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$g0 r6 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$g0
            r0 = 0
            r6.<init>(r0)
            r1 = 0
            com.sumsub.sns.core.presentation.base.a.a(r5, r1, r6, r4, r0)
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.f(com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel, T9.a):java.lang.Object");
    }

    public final void d(Map<String, b> map) {
        this.f18430L.a(this, f18420O[5], map);
    }

    public static /* synthetic */ Object e(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, T9.a aVar) {
        return sNSPreviewPhotoDocumentViewModel.a("sns_preview_photo_title", (T9.a<? super String>) aVar);
    }

    public final void c(Map<String, com.sumsub.sns.internal.ml.badphotos.models.b> map) {
        this.f18429K.a(this, f18420O[4], map);
    }

    public void d(boolean z10) {
        if (z10) {
            if (I() == IdentitySide.Front) {
                a(I().getValue(), new com.sumsub.sns.internal.ml.badphotos.models.b(null, null, null, null, null, null, null, null, null, 511, null));
                a(IdentitySide.Back);
            }
            a(this, (IdentitySide) null, 1, (Object) null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new y(null), 3, null);
            return;
        }
        if (!F().isEmpty()) {
            List<com.sumsub.sns.internal.core.data.model.n> F10 = F();
            if (!(F10 instanceof Collection) || !F10.isEmpty()) {
                Iterator<T> it = F10.iterator();
                while (it.hasNext()) {
                    if (!((com.sumsub.sns.internal.core.data.model.n) it.next()).n()) {
                    }
                }
            }
            a(u());
            return;
        }
        M();
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public void c(boolean z10) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new p0(z10, null), 1, null);
    }

    public final void e(boolean z10) {
        this.f18431M.a(this, f18420O[6], Boolean.valueOf(z10));
    }

    public final void b(com.sumsub.sns.internal.core.data.model.l lVar) {
        this.f18426H.a(this, f18420O[1], lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r34, T9.a<? super O9.p> r35) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.c(boolean, T9.a):java.lang.Object");
    }

    public final String e(String str) {
        com.sumsub.sns.internal.core.data.model.e d10 = d();
        return a(d10 != null ? com.sumsub.sns.internal.core.data.model.f.p(d10) : null, str);
    }

    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18521a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18522b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18523c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f18524d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f18525e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f18526f;

        public k(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11) {
            this.f18521a = charSequence;
            this.f18522b = charSequence2;
            this.f18523c = charSequence3;
            this.f18524d = charSequence4;
            this.f18525e = z10;
            this.f18526f = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.f.b(this.f18521a, kVar.f18521a) && kotlin.jvm.internal.f.b(this.f18522b, kVar.f18522b) && kotlin.jvm.internal.f.b(this.f18523c, kVar.f18523c) && kotlin.jvm.internal.f.b(this.f18524d, kVar.f18524d) && this.f18525e == kVar.f18525e && this.f18526f == kVar.f18526f;
        }

        public final CharSequence g() {
            return this.f18523c;
        }

        public final CharSequence h() {
            return this.f18524d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            CharSequence charSequence = this.f18521a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18522b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18523c;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f18524d;
            int hashCode4 = (hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
            boolean z10 = this.f18525e;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode4 + i) * 31;
            boolean z11 = this.f18526f;
            return i9 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public final CharSequence i() {
            return this.f18522b;
        }

        public final boolean j() {
            return this.f18526f;
        }

        public final CharSequence k() {
            return this.f18521a;
        }

        public final boolean l() {
            return this.f18525e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("WarningResult(title=");
            sb2.append((Object) this.f18521a);
            sb2.append(", message=");
            sb2.append((Object) this.f18522b);
            sb2.append(", buttonPrimary=");
            sb2.append((Object) this.f18523c);
            sb2.append(", buttonSecondary=");
            sb2.append((Object) this.f18524d);
            sb2.append(", isFatal=");
            sb2.append(this.f18525e);
            sb2.append(", showIcon=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f18526f, ')');
        }

        public /* synthetic */ k(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, charSequence2, charSequence3, charSequence4, z10, (i & 32) != 0 ? true : z11);
        }
    }

    public final void b(IdentitySide identitySide) {
        String value;
        com.sumsub.sns.internal.core.analytics.b bVar = com.sumsub.sns.internal.core.analytics.b.f14967a;
        GlobalStatePayload globalStatePayload = GlobalStatePayload.IdDocSubType;
        if (identitySide == null || (value = identitySide.getValue()) == null) {
            value = I().getValue();
        }
        bVar.a(globalStatePayload, value);
    }

    public static /* synthetic */ Object b(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, boolean z10, T9.a aVar, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveSecondSide");
        }
        if ((i9 & 1) != 0) {
            z10 = false;
        }
        return sNSPreviewPhotoDocumentViewModel.b(z10, (T9.a<? super O9.p>) aVar);
    }

    public final void b(List<com.sumsub.sns.internal.core.data.model.n> list) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new s0(list, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.sumsub.sns.internal.core.data.model.n r12, T9.a<? super android.graphics.Bitmap> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.q
            if (r0 == 0) goto L13
            r0 = r13
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$q r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.q) r0
            int r1 = r0.f18573d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18573d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$q r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$q
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f18571b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18573d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r12 = r0.f18570a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r12 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r12
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L2c
            goto L4d
        L2c:
            r13 = move-exception
            goto L53
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            kotlin.b.b(r13)
            java.io.File r12 = r12.k()     // Catch: java.lang.Throwable -> L51
            if (r12 == 0) goto L8e
            r0.f18570a = r11     // Catch: java.lang.Throwable -> L51
            r0.f18573d = r3     // Catch: java.lang.Throwable -> L51
            r13 = 1920(0x780, float:2.69E-42)
            java.lang.Object r13 = com.sumsub.sns.internal.core.common.m0.b(r12, r13, r0)     // Catch: java.lang.Throwable -> L51
            if (r13 != r1) goto L4c
            return r1
        L4c:
            r12 = r11
        L4d:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13     // Catch: java.lang.Throwable -> L2c
            r4 = r13
            goto L8e
        L51:
            r13 = move-exception
            r12 = r11
        L53:
            com.sumsub.sns.internal.log.a r0 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r1 = com.sumsub.sns.internal.log.c.a(r12)
            java.lang.String r2 = r13.getMessage()
            if (r2 != 0) goto L61
            java.lang.String r2 = ""
        L61:
            r0.e(r1, r2, r13)
            com.sumsub.sns.internal.camera.photo.presentation.document.b r0 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "decodePdf errro: "
            r1.<init>(r2)
            java.lang.String r2 = r13.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DocCapture"
            r0.b(r2, r1, r13)
            S0.a r5 = androidx.lifecycle.C0552s.b(r12)
            kotlinx.coroutines.NonCancellable r6 = kotlinx.coroutines.NonCancellable.INSTANCE
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$r r8 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$r
            r8.<init>(r13, r4)
            r10 = 0
            r7 = 0
            r9 = 2
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.b(com.sumsub.sns.internal.core.data.model.n, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(T9.a<? super java.util.List<java.lang.String>> r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.f(T9.a):java.lang.Object");
    }

    public final void a(IdentitySide identitySide) {
        this.f18425G.a(this, f18420O[0], identitySide);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "Preview photo error handling... " + oVar, null, 4, null);
        if (oVar instanceof o.e) {
            M();
        }
    }

    public String d(String str) {
        com.sumsub.sns.internal.core.data.model.e d10 = d();
        return a(d10 != null ? com.sumsub.sns.internal.core.data.model.f.j(d10) : null, str);
    }

    public final void a(List<com.sumsub.sns.internal.core.data.model.n> list) {
        this.f18427I.a(this, f18420O[2], list);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.Content> r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.d(T9.a):java.lang.Object");
    }

    public static /* synthetic */ void a(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, IdentitySide identitySide, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAnalyticSideType");
        }
        if ((i9 & 1) != 0) {
            identitySide = null;
        }
        sNSPreviewPhotoDocumentViewModel.b(identitySide);
    }

    public static Object a(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, boolean z10, T9.a aVar) {
        Object h9 = sNSPreviewPhotoDocumentViewModel.h((T9.a<? super O9.p>) aVar);
        return h9 == CoroutineSingletons.f23158a ? h9 : O9.p.f3034a;
    }

    public final void b(com.sumsub.sns.internal.core.data.model.n nVar) {
        b(Collections.singletonList(nVar));
    }

    public final void a(com.sumsub.sns.internal.core.data.model.n nVar, int i9) {
        int i10 = i9 % 360;
        if (i10 != 0) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b bVar = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a;
            StringBuilder sb2 = new StringBuilder("applyRotation: ");
            File m2 = nVar.m();
            sb2.append(m2 != null ? m2.getName() : null);
            sb2.append(" -> ");
            sb2.append(i9);
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, "DocCapture", sb2.toString(), null, 4, null);
            if (i10 <= 0) {
                i10 += 360;
            }
            try {
                L0.a aVar = new L0.a(nVar.m());
                aVar.H("Orientation", String.valueOf(com.sumsub.sns.internal.core.common.i.b(i10 + aVar.n())));
                aVar.D();
            } catch (Exception e10) {
                a("Can't apply rotation", e10);
            }
        }
    }

    public final void b(int i9) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new v0(i9, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, T9.a<? super java.util.List<java.lang.String>> r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.b(java.lang.String, T9.a):java.lang.Object");
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$2", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {727, 747, 752, 753, 762, 764, 769}, m = "invokeSuspend")
    public static final class c0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18452a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18453b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18454c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18455d;

        /* renamed from: e, reason: collision with root package name */
        public Object f18456e;

        /* renamed from: f, reason: collision with root package name */
        public Object f18457f;

        /* renamed from: g, reason: collision with root package name */
        public Object f18458g;

        /* renamed from: h, reason: collision with root package name */
        public Object f18459h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f18460j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f18461k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<com.sumsub.sns.internal.core.data.model.remote.k> f18462l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SNSPreviewPhotoDocumentViewModel f18463m;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$2$1", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<g, T9.a<? super g>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18464a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f18465b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Spanned f18466c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f18467d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Spanned spanned, k kVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18466c = spanned;
                this.f18467d = kVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g gVar, T9.a<? super g> aVar) {
                return ((a) create(gVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f18466c, this.f18467d, aVar);
                aVar2.f18465b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f18464a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                g gVar = (g) this.f18465b;
                Content f10 = gVar.f();
                return g.a(gVar, null, this.f18467d, false, false, f10 != null ? Content.a(f10, this.f18466c, null, null, null, null, null, null, 126, null) : null, 9, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(List<com.sumsub.sns.internal.core.data.model.remote.k> list, SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, T9.a<? super c0> aVar) {
            super(2, aVar);
            this.f18462l = list;
            this.f18463m = sNSPreviewPhotoDocumentViewModel;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((c0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            c0 c0Var = new c0(this.f18462l, this.f18463m, aVar);
            c0Var.f18461k = obj;
            return c0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x03aa  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0113 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x03ac  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0384  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0343  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0361  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0331 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0332  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01ba  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x02af -> B:42:0x02b6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 1048
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class b extends Lambda implements InterfaceC0646l<Spanned, CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f18468a = new b();

            public b() {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Spanned spanned) {
                return spanned;
            }
        }
    }

    public final void a(com.sumsub.sns.internal.core.data.model.l lVar) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "on picker results: " + lVar, null, 4, null);
        if (lVar == null) {
            return;
        }
        b(lVar);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new z(lVar, this, null), 3, null);
    }

    public void a(com.sumsub.sns.internal.core.data.model.n nVar) {
        com.sumsub.sns.internal.core.data.model.n a10;
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "on picker result: " + nVar, null, 4, null);
        if (nVar == null) {
            if (F().isEmpty()) {
                com.sumsub.sns.core.presentation.base.a.a(this, q.a.f15160b, (Object) null, (Long) null, 6, (Object) null);
            } else {
                if (I() == IdentitySide.Back) {
                    a(IdentitySide.Front);
                }
                a(this, (IdentitySide) null, 1, (Object) null);
            }
            c(true);
            b(false);
            return;
        }
        ArrayList arrayList = new ArrayList(F());
        P9.q.z(arrayList, new x(nVar));
        if (nVar.p() == null) {
            a10 = nVar.a((r20 & 1) != 0 ? nVar.f15522a : null, (r20 & 2) != 0 ? nVar.f15523b : null, (r20 & 4) != 0 ? nVar.f15524c : null, (r20 & 8) != 0 ? nVar.f15525d : v(), (r20 & 16) != 0 ? nVar.f15526e : null, (r20 & 32) != 0 ? nVar.f15527f : false, (r20 & 64) != 0 ? nVar.f15528g : null, (r20 & 128) != 0 ? nVar.f15529h : null, (r20 & 256) != 0 ? nVar.i : false);
            arrayList.add(a10);
        } else {
            arrayList.add(nVar);
        }
        a(arrayList);
        a(I().getValue(), nVar.l());
        b(nVar);
    }

    public final void c(List<com.sumsub.sns.internal.core.data.model.n> list) {
        for (com.sumsub.sns.internal.core.data.model.n nVar : list) {
            if (!nVar.t()) {
                IdentitySide o10 = nVar.o();
                a(o10 != null ? o10.getValue() : null, nVar.l());
            }
        }
    }

    public final void a(String str, com.sumsub.sns.internal.ml.badphotos.models.b bVar) {
        com.sumsub.sns.internal.ml.badphotos.models.b bVar2;
        if (str == null) {
            str = IdentitySide.Front.getValue();
        }
        com.sumsub.sns.internal.ml.badphotos.models.b bVar3 = A().get(str);
        if (bVar != null || bVar3 == null) {
            bVar2 = bVar;
        } else {
            bVar2 = bVar3.a((r20 & 1) != 0 ? bVar3.f17628a : null, (r20 & 2) != 0 ? bVar3.f17629b : null, (r20 & 4) != 0 ? bVar3.f17630c : null, (r20 & 8) != 0 ? bVar3.f17631d : null, (r20 & 16) != 0 ? bVar3.f17632e : null, (r20 & 32) != 0 ? bVar3.f17633f : null, (r20 & 64) != 0 ? bVar3.f17634g : null, (r20 & 128) != 0 ? bVar3.f17635h : null, (r20 & 256) != 0 ? bVar3.i : Boolean.FALSE);
        }
        if (bVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A());
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "updateCheckPhotoQualityResults side=" + str + ", " + bVar, null, 4, null);
        linkedHashMap.put(str, bVar2);
        c(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.model.n r6, T9.a<? super android.graphics.Bitmap> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.p
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$p r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.p) r0
            int r1 = r0.f18566d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18566d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$p r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$p
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18564b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18566d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.f18563a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r6 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r6
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L4d
        L2c:
            r7 = move-exception
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.b.b(r7)
            java.io.File r6 = r6.k()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L69
            r0.f18563a = r5     // Catch: java.lang.Throwable -> L51
            r0.f18566d = r4     // Catch: java.lang.Throwable -> L51
            r7 = 1920(0x780, float:2.69E-42)
            java.lang.Object r7 = com.sumsub.sns.internal.core.common.m0.a(r6, r7, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r6 = r5
        L4d:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: java.lang.Throwable -> L2c
            r3 = r7
            goto L69
        L51:
            r7 = move-exception
            r6 = r5
        L53:
            com.sumsub.sns.internal.camera.photo.presentation.document.b r0 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            java.lang.String r1 = "DocCapture"
            java.lang.String r2 = "Can't decode image"
            r0.b(r1, r2, r7)
            boolean r0 = r7 instanceof java.lang.Exception
            if (r0 == 0) goto L63
            java.lang.Exception r7 = (java.lang.Exception) r7
            goto L64
        L63:
            r7 = r3
        L64:
            if (r7 == 0) goto L69
            r6.a(r2, r7)
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.a(com.sumsub.sns.internal.core.data.model.n, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.graphics.Bitmap r16, com.sumsub.sns.internal.ml.badphotos.models.b r17, com.sumsub.sns.internal.core.data.model.IdentitySide r18, T9.a<? super com.sumsub.sns.internal.ml.core.e.a<com.sumsub.sns.internal.ml.badphotos.models.a>> r19) {
        /*
            r15 = this;
            r7 = r15
            r0 = r19
            boolean r1 = r0 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.n
            if (r1 == 0) goto L17
            r1 = r0
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$n r1 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.n) r1
            int r2 = r1.f18552d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f18552d = r2
        L15:
            r4 = r1
            goto L1d
        L17:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$n r1 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$n
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r4.f18550b
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r4.f18552d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r1 = r4.f18549a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r1 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r1
            kotlin.b.b(r0)
            goto Lae
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.b.b(r0)
            if (r17 == 0) goto L7d
            boolean r0 = r17.s()
            if (r0 != 0) goto L7d
            com.sumsub.sns.internal.camera.photo.presentation.document.b r9 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            r13 = 4
            r14 = 0
            java.lang.String r10 = "DocCapture"
            java.lang.String r11 = "taking previous quality check result"
            r12 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(r9, r10, r11, r12, r13, r14)
            com.sumsub.sns.internal.ml.core.e$a$d r0 = new com.sumsub.sns.internal.ml.core.e$a$d
            com.sumsub.sns.internal.ml.badphotos.models.a r1 = new com.sumsub.sns.internal.ml.badphotos.models.a
            java.lang.String r2 = r17.l()
            if (r2 != 0) goto L5c
            java.lang.String r2 = ""
        L5c:
            java.lang.Float r3 = r17.n()
            if (r3 == 0) goto L67
            float r3 = r3.floatValue()
            goto L68
        L67:
            r3 = 0
        L68:
            java.lang.Long r4 = r17.o()
            if (r4 == 0) goto L73
            long r4 = r4.longValue()
            goto L75
        L73:
            r4 = 0
        L75:
            r1.<init>(r2, r3, r4)
            r0.<init>(r1)
        L7b:
            r1 = r7
            goto Lb0
        L7d:
            r0 = 0
            if (r17 == 0) goto L85
            java.lang.String r1 = r17.m()
            goto L86
        L85:
            r1 = r0
        L86:
            java.lang.String r3 = "skip"
            boolean r1 = kotlin.jvm.internal.f.b(r1, r3)
            if (r1 == 0) goto L94
            com.sumsub.sns.internal.ml.core.e$a$c r0 = new com.sumsub.sns.internal.ml.core.e$a$c
            r0.<init>()
            goto L7b
        L94:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$o r3 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$o
            r1 = r16
            r5 = r18
            r3.<init>(r1, r5, r0)
            r4.f18549a = r7
            r4.f18552d = r2
            r5 = 1
            r6 = 0
            r1 = 0
            r0 = r15
            java.lang.Object r0 = com.sumsub.sns.core.presentation.base.a.a(r0, r1, r3, r4, r5, r6)
            if (r0 != r8) goto Lad
            return r8
        Lad:
            r1 = r7
        Lae:
            com.sumsub.sns.internal.ml.core.e$a r0 = (com.sumsub.sns.internal.ml.core.e.a) r0
        Lb0:
            com.sumsub.sns.internal.ff.a r2 = com.sumsub.sns.internal.ff.a.f16930a
            com.sumsub.sns.internal.ff.core.a r2 = r2.v()
            boolean r2 = r2.g()
            if (r2 == 0) goto Lc4
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$j r2 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$j
            r2.<init>(r0)
            r1.a(r2)
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.a(android.graphics.Bitmap, com.sumsub.sns.internal.ml.badphotos.models.b, com.sumsub.sns.internal.core.data.model.IdentitySide, T9.a):java.lang.Object");
    }

    public final void a(String str, Exception exc) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), NonCancellable.INSTANCE, null, new o0(str, exc, null), 2, null);
    }

    public static Object a(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, T9.a aVar) {
        if (sNSPreviewPhotoDocumentViewModel.H()) {
            sNSPreviewPhotoDocumentViewModel.f(false);
            Object c2 = sNSPreviewPhotoDocumentViewModel.c(false, (T9.a<? super O9.p>) aVar);
            return c2 == CoroutineSingletons.f23158a ? c2 : O9.p.f3034a;
        }
        return O9.p.f3034a;
    }

    public String a(Map<String, String> map, String str) {
        return (map != null ? map.get(str) : null) != null ? str : "default";
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0208, code lost:
    
        if (kotlin.jvm.internal.f.b(r2 != null ? r2.h() : null, r5.s()) == false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List<com.sumsub.sns.internal.core.data.model.remote.k> r24, T9.a<? super O9.p> r25) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.a(java.util.List, T9.a):java.lang.Object");
    }

    public final void a(com.sumsub.sns.internal.core.data.model.s sVar) {
        a(new c(sVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.graphics.Bitmap r18, com.sumsub.sns.internal.core.data.model.IdentitySide r19, T9.a<? super com.sumsub.sns.internal.ml.core.e.a<com.sumsub.sns.internal.ml.badphotos.models.a>> r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.a(android.graphics.Bitmap, com.sumsub.sns.internal.core.data.model.IdentitySide, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.model.IdentitySide r21, com.sumsub.sns.internal.ml.core.e.a<com.sumsub.sns.internal.ml.badphotos.models.a> r22, T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.Content> r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.a(com.sumsub.sns.internal.core.data.model.IdentitySide, com.sumsub.sns.internal.ml.core.e$a, T9.a):java.lang.Object");
    }

    public final void a(Exception exc) {
        com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Exception while uploading identity photos", exc);
        com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a.b("DocCapture", "Exception while uploading identity photos", exc);
        b(false);
        com.sumsub.sns.core.presentation.base.a.a(this, exc, v(), (Object) null, 4, (Object) null);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new a0(null), 1, null);
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof a.j) {
            a((a.j) parcelable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (kotlin.jvm.internal.f.b(r0 != null ? r0.r() : null, com.sumsub.sns.internal.core.data.model.VideoRequiredType.Disabled.getValue()) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r17, boolean r18, com.sumsub.sns.internal.core.data.model.g r19, T9.a r20) {
        /*
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.l0
            if (r2 == 0) goto L17
            r2 = r1
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$l0 r2 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.l0) r2
            int r3 = r2.f18539h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f18539h = r3
            goto L1c
        L17:
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$l0 r2 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$l0
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f18537f
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r4 = r2.f18539h
            r5 = 1
            if (r4 == 0) goto L47
            if (r4 != r5) goto L3f
            boolean r0 = r2.f18536e
            boolean r3 = r2.f18535d
            java.lang.Object r4 = r2.f18534c
            com.sumsub.sns.internal.core.data.model.Document r4 = (com.sumsub.sns.internal.core.data.model.Document) r4
            java.lang.Object r6 = r2.f18533b
            com.sumsub.sns.internal.core.data.model.g r6 = (com.sumsub.sns.internal.core.data.model.g) r6
            java.lang.Object r2 = r2.f18532a
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel r2 = (com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel) r2
            kotlin.b.b(r1)
            r7 = r0
            r0 = r2
            r12 = r3
            r8 = r4
            goto L6d
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.b.b(r1)
            boolean r1 = r17.J()
            com.sumsub.sns.internal.core.data.model.Document r4 = r17.u()
            r2.f18532a = r0
            r6 = r19
            r2.f18533b = r6
            r2.f18534c = r4
            r7 = r18
            r2.f18535d = r7
            r2.f18536e = r1
            r2.f18539h = r5
            java.lang.Object r2 = r0.g(r2)
            if (r2 != r3) goto L69
            return r3
        L69:
            r8 = r4
            r12 = r7
            r7 = r1
            r1 = r2
        L6d:
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            com.sumsub.sns.internal.core.data.model.Document r1 = r0.u()
            com.sumsub.sns.internal.core.data.model.DocumentType r1 = r1.getType()
            com.sumsub.sns.internal.core.data.model.e r0 = r0.d()
            if (r0 == 0) goto L89
            java.lang.String r2 = r1.c()
            boolean r0 = com.sumsub.sns.internal.core.data.model.f.a(r0, r2)
            if (r0 != r5) goto L89
            goto Laf
        L89:
            boolean r0 = r1.h()
            if (r0 != 0) goto Laf
            boolean r0 = r1.k()
            if (r0 == 0) goto Lae
            com.sumsub.sns.internal.core.data.model.g$c$a r0 = r6.a(r1)
            if (r0 == 0) goto La0
            java.lang.String r0 = r0.r()
            goto La1
        La0:
            r0 = 0
        La1:
            com.sumsub.sns.internal.core.data.model.VideoRequiredType r1 = com.sumsub.sns.internal.core.data.model.VideoRequiredType.Disabled
            java.lang.String r1 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.f.b(r0, r1)
            if (r0 == 0) goto Lae
            goto Laf
        Lae:
            r5 = 0
        Laf:
            r10 = r5
            com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$f r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel$f
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 16
            r16 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.a(com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel, boolean, com.sumsub.sns.internal.core.data.model.g, T9.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v16, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r18, T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.DocumentSideness> r19) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.a(boolean, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object a(SNSPreviewPhotoDocumentViewModel sNSPreviewPhotoDocumentViewModel, boolean z10, T9.a aVar, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: documentSideness");
        }
        if ((i9 & 1) != 0) {
            z10 = false;
        }
        return sNSPreviewPhotoDocumentViewModel.a(z10, (T9.a<? super SNSPreviewIdentityDocumentViewModel.DocumentSideness>) aVar);
    }

    public final void a(File file, int i9) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onPhotoRotationChanged: " + file.getName() + " -> " + i9, null, 4, null);
        String absolutePath = file.getAbsolutePath();
        LinkedHashMap linkedHashMap = new LinkedHashMap(D());
        b bVar = (b) linkedHashMap.get(absolutePath);
        if (bVar == null) {
            return;
        }
        linkedHashMap.put(absolutePath, bVar.a(i9));
        d(wa.b.x(linkedHashMap));
        com.sumsub.sns.core.presentation.base.a.a(this, false, new e0(file, i9, this, null), 1, null);
    }

    public final void a(int i9) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", com.google.android.gms.measurement.internal.a.g(i9, "onPageSelected: "), null, 4, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void a(com.sumsub.sns.internal.core.data.model.o oVar) {
        if (oVar instanceof o.e) {
            com.sumsub.sns.core.presentation.base.a.a(this, (com.sumsub.sns.internal.core.common.q) null, (Object) null, (Long) null, 7, (Object) null);
        } else {
            super.a(oVar);
        }
    }
}
