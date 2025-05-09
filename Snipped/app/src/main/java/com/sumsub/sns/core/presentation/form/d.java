package com.sumsub.sns.core.presentation.form;

import O9.p;
import P9.n;
import P9.q;
import P9.s;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$string;
import com.sumsub.sns.internal.core.android.a;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.r;
import com.sumsub.sns.internal.core.common.x;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.core.presentation.form.model.b;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.C0963h;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.StateFlow;
import sa.AbstractC1244a;
import t0.C1275b;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002P^\u0018\u0000 o2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\u000eJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\t\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011*\b\u0012\u0004\u0012\u00020\u00190\u0011H\u0002¢\u0006\u0004\b\t\u0010\u001aJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\t\u0010\u001bJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\t\u0010\u001fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\t\u0010!J\u0019\u0010\"\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\"\u0010#J-\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020(2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0003J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010#J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00105R\u001d\u0010:\u001a\u0004\u0018\u0001068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109R\u001d\u0010=\u001a\u0004\u0018\u0001068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u001d\u0010B\u001a\u0004\u0018\u00010>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u0016\u0010T\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010SR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00190\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010UR\"\u0010[\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\f0W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010SR\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\b?\u0010eR\u0014\u0010h\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010gR\u0014\u0010i\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010gR\u0016\u0010l\u001a\u0004\u0018\u00010j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010kR\u0016\u0010n\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010m¨\u0006p"}, d2 = {"Lcom/sumsub/sns/core/presentation/form/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/sumsub/sns/internal/core/presentation/form/b$a;", "state", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/presentation/form/b$a;Landroid/os/Bundle;)V", "i", "", "mimeTypes", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "currentPageNumber", "", "Lcom/sumsub/sns/internal/core/presentation/form/b$b;", "pages", "(ILjava/util/List;)V", "page", "b", "(Lcom/sumsub/sns/internal/core/presentation/form/b$b;)V", "j", "Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem;", "(Ljava/util/List;)Ljava/util/List;", "(Lcom/sumsub/sns/internal/core/presentation/form/b$b;)Ljava/util/List;", "requestId", "Landroid/net/Uri;", "uris", "(Ljava/lang/String;Ljava/util/List;)V", "uri", "(Ljava/lang/String;Landroid/net/Uri;)V", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "outState", "onSaveInstanceState", "", "k", "()Z", "Lcom/sumsub/sns/internal/core/presentation/form/b$b;", "Landroid/widget/TextView;", "Lcom/sumsub/sns/internal/core/common/z;", "h", "()Landroid/widget/TextView;", "tvTitle", "c", "g", "tvSubtitle", "Landroidx/recyclerview/widget/RecyclerView;", "d", "e", "()Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "listLayoutManager", "Lcom/sumsub/sns/core/presentation/form/viewadapter/i;", "f", "Lcom/sumsub/sns/core/presentation/form/viewadapter/i;", "formItemAdapter", "Lcom/sumsub/sns/internal/core/android/a;", "Lcom/sumsub/sns/internal/core/android/a;", "observer", "Lcom/sumsub/sns/core/presentation/util/a;", "Lcom/sumsub/sns/core/presentation/util/a;", "uniqueIdHolder", "com/sumsub/sns/core/presentation/form/d$d", "Lcom/sumsub/sns/core/presentation/form/d$d;", "itemValueProvider", "Z", "scrollRestored", "Ljava/util/List;", "visibleItems", "", "Lcom/sumsub/sns/internal/core/presentation/form/FieldId;", "l", "Ljava/util/Map;", "itemErrorMap", "m", "disableSubmitModelUpdates", "com/sumsub/sns/core/presentation/form/d$b", "n", "Lcom/sumsub/sns/core/presentation/form/d$b;", "fieldViewCallback", "Lcom/sumsub/sns/internal/core/presentation/form/d;", "o", "LO9/f;", "()Lcom/sumsub/sns/internal/core/presentation/form/d;", "itemValueCache", "()Ljava/lang/String;", "clientTag", "logTag", "Lcom/sumsub/sns/internal/core/presentation/form/b;", "()Lcom/sumsub/sns/internal/core/presentation/form/b;", "hostViewModel", "()Landroid/view/ViewGroup;", FirebaseAnalytics.Param.CONTENT, "p", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends Fragment {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f14174q;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public b.C0241b page;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public LinearLayoutManager listLayoutManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.core.presentation.form.viewadapter.i formItemAdapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a observer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean scrollRestored;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean disableSubmitModelUpdates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle = a0.a(this, R$id.sns_title);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z tvSubtitle = a0.a(this, R$id.sns_subtitle);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z list = a0.a(this, R$id.sns_list);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.sumsub.sns.core.presentation.util.a uniqueIdHolder = new com.sumsub.sns.core.presentation.util.a();

    /* renamed from: i, reason: from kotlin metadata */
    public final C0164d itemValueProvider = new C0164d();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public List<? extends FormItem> visibleItems = EmptyList.f23104a;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Map<FieldId, String> itemErrorMap = kotlin.collections.a.p();

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final b fieldViewCallback = new b();

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final O9.f itemValueCache = kotlin.a.a(new c());

    /* renamed from: com.sumsub.sns.core.presentation.form.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment a(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("client_tag", str);
            d dVar = new d();
            dVar.setArguments(bundle);
            return dVar;
        }

        public Companion() {
        }
    }

    public static final class b implements com.sumsub.sns.core.presentation.form.c {
        public b() {
        }

        @Override // com.sumsub.sns.core.presentation.form.c
        public void a(FormItem formItem, List<String> list) {
            if (d.this.disableSubmitModelUpdates) {
                return;
            }
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, d.this.f(), "onValuesChanged: " + formItem.k() + " -> " + list, null, 4, null);
            com.sumsub.sns.internal.core.presentation.form.b c2 = d.this.c();
            if (c2 != null) {
                c2.a(formItem, list);
            }
            if (formItem instanceof FormItem.h) {
                return;
            }
            d.this.j();
        }

        @Override // com.sumsub.sns.core.presentation.form.c
        public void b(FormItem formItem, String str) {
            FieldId b9;
            if (d.this.disableSubmitModelUpdates) {
                return;
            }
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, d.this.f(), "onValueChanged: " + formItem.k() + " -> " + str, null, 4, null);
            d dVar = d.this;
            Map map = dVar.itemErrorMap;
            b9 = com.sumsub.sns.core.presentation.form.e.b(formItem);
            dVar.itemErrorMap = com.sumsub.sns.internal.core.common.i.a((Map<FieldId, ? extends Object>) map, b9, (Object) null);
            com.sumsub.sns.internal.core.presentation.form.b c2 = d.this.c();
            if (c2 != null) {
                c2.b(formItem, str);
            }
            if (formItem instanceof FormItem.h) {
                return;
            }
            d.this.j();
        }

        @Override // com.sumsub.sns.core.presentation.form.c
        public void c(FormItem formItem) {
        }

        @Override // com.sumsub.sns.core.presentation.form.c
        public void c(FormItem formItem, String str) {
            r.a(d.this, str);
        }

        @Override // com.sumsub.sns.core.presentation.form.c
        public void a(FormItem formItem) {
            FieldId fieldId = new FieldId(formItem.e(), formItem.d().p());
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, d.this.f(), "onPickFileClick: " + fieldId, null, 4, null);
            AbstractC1244a a10 = x.a(false, 1, null);
            String b9 = a10.b(j3.e.B(a10.f27066b, kotlin.jvm.internal.h.d(FieldId.class)), fieldId);
            a aVar = d.this.observer;
            if (aVar != null) {
                aVar.a(b9);
            }
        }

        @Override // com.sumsub.sns.core.presentation.form.c
        public void a(FormItem formItem, String str) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, d.this.f(), "onDeleteFileClick: " + formItem + " -> " + str, null, 4, null);
            com.sumsub.sns.internal.core.presentation.form.b c2 = d.this.c();
            if (c2 != null) {
                c2.a(formItem, str);
            }
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.presentation.form.d> {
        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.presentation.form.d invoke() {
            com.sumsub.sns.internal.core.presentation.form.b c2 = d.this.c();
            if (c2 != null) {
                return c2.a();
            }
            return null;
        }
    }

    /* renamed from: com.sumsub.sns.core.presentation.form.d$d, reason: collision with other inner class name */
    public static final class C0164d implements com.sumsub.sns.core.presentation.form.f {
        public C0164d() {
        }

        @Override // com.sumsub.sns.core.presentation.form.f
        public String a(FormItem formItem) {
            com.sumsub.sns.internal.core.presentation.form.d d10 = d.this.d();
            String e10 = formItem.e();
            if (e10 == null) {
                e10 = "";
            }
            String p10 = formItem.d().p();
            return d10.a(e10, p10 != null ? p10 : "");
        }

        @Override // com.sumsub.sns.core.presentation.form.f
        public List<String> b(FormItem formItem) {
            com.sumsub.sns.internal.core.presentation.form.d d10 = d.this.d();
            String e10 = formItem.e();
            if (e10 == null) {
                e10 = "";
            }
            String p10 = formItem.d().p();
            return d10.b(e10, p10 != null ? p10 : "");
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.form.FormFragment$onViewCreated$2", f = "FormFragment.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14192a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14193b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f14195d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Bundle bundle, T9.a<? super e> aVar) {
            super(2, aVar);
            this.f14195d = bundle;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.a aVar, T9.a<? super p> aVar2) {
            return ((e) create(aVar, aVar2)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            e eVar = d.this.new e(this.f14195d, aVar);
            eVar.f14193b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14192a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            d.this.a((b.a) this.f14193b, this.f14195d);
            return p.f3034a;
        }
    }

    public static final class f extends Lambda implements InterfaceC0650p<String, Uri, p> {
        public f() {
            super(2);
        }

        public final void a(String str, Uri uri) {
            d.this.a(str, uri);
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ p invoke(String str, Uri uri) {
            a(str, uri);
            return p.f3034a;
        }
    }

    public static final class g extends Lambda implements InterfaceC0650p<String, List<? extends Uri>, p> {
        public g() {
            super(2);
        }

        public final void a(String str, List<? extends Uri> list) {
            d.this.a(str, list);
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ p invoke(String str, List<? extends Uri> list) {
            a(str, list);
            return p.f3034a;
        }
    }

    public static final class h extends Lambda implements InterfaceC0646l<String, p> {
        public h() {
            super(1);
        }

        public final void a(String str) {
            r.a(d.this, str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    public static final class i extends Lambda implements InterfaceC0646l<String, p> {
        public i() {
            super(1);
        }

        public final void a(String str) {
            r.a(d.this, str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(d.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f14174q = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, d.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(d.class, "list", "getList()Landroidx/recyclerview/widget/RecyclerView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public final TextView h() {
        return (TextView) this.tvTitle.a(this, f14174q[0]);
    }

    public final void i() {
        a aVar = this.observer;
        if (aVar != null) {
            getLifecycle().c(aVar);
            this.observer = null;
        }
    }

    public final void j() {
        StateFlow<b.a> b9;
        b.a value;
        Object obj;
        FieldId b10;
        com.sumsub.sns.internal.core.presentation.form.b c2 = c();
        if (c2 == null || (b9 = c2.b()) == null || (value = b9.getValue()) == null) {
            return;
        }
        b.C0241b c0241b = (b.C0241b) s.M(value.f(), value.h());
        if (c0241b == null) {
            return;
        }
        List<FormItem> a10 = a(a(c0241b));
        ArrayList arrayList = new ArrayList(n.u(a10, 10));
        for (FormItem formItem : a10) {
            Map<FieldId, String> map = this.itemErrorMap;
            b10 = com.sumsub.sns.core.presentation.form.e.b(formItem);
            String str = map.get(b10);
            if (str != null) {
                Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "field with error " + formItem.k(), null, 4, null);
                FormItem a11 = com.sumsub.sns.internal.core.presentation.form.model.e.a(formItem, str);
                if (a11 != null) {
                    formItem = a11;
                }
            }
            arrayList.add(formItem);
        }
        this.visibleItems = arrayList;
        if (e0.f15081a.isDebug()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((FormItem) obj) instanceof FormItem.k) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            FormItem formItem2 = (FormItem) obj;
            if (formItem2 != null) {
                Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "phone field error=" + ((Object) formItem2.b()), null, 4, null);
            }
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "visible " + arrayList.size() + " items", null, 4, null);
        com.sumsub.sns.core.presentation.form.viewadapter.i iVar = this.formItemAdapter;
        if (iVar != null) {
            iVar.a(arrayList);
        }
    }

    public final boolean k() {
        com.sumsub.sns.internal.core.presentation.form.b c2;
        StateFlow<b.a> b9;
        b.a value;
        b.c i9;
        RecyclerView e10;
        FieldId b10;
        FieldId b11;
        FieldId b12;
        if (b() == null || (c2 = c()) == null || (b9 = c2.b()) == null || (value = b9.getValue()) == null || (i9 = value.i()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FormItem formItem = null;
        for (FormItem formItem2 : this.visibleItems) {
            if (!com.sumsub.sns.core.presentation.form.model.a.a(formItem2, this.itemValueProvider)) {
                if (formItem == null) {
                    formItem = formItem2;
                }
                Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "failed check for " + formItem2.k(), null, 4, null);
                String a10 = com.sumsub.sns.core.presentation.form.model.a.a(formItem2, i9, this.itemValueProvider);
                if (a10 != null) {
                    b12 = com.sumsub.sns.core.presentation.form.e.b(formItem2);
                    linkedHashMap.put(b12, a10);
                }
            }
        }
        this.itemErrorMap = linkedHashMap;
        if (formItem == null) {
            return true;
        }
        j();
        Iterator<? extends FormItem> it = this.visibleItems.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            b10 = com.sumsub.sns.core.presentation.form.e.b(it.next());
            b11 = com.sumsub.sns.core.presentation.form.e.b(formItem);
            if (kotlin.jvm.internal.f.b(b10, b11)) {
                break;
            }
            i10++;
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), s3.b.i("validateForm: scroll to ", i10, " position"), null, 4, null);
        if (i10 >= 0 && (e10 = e()) != null) {
            e10.post(new F.e(i10, 3, this));
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.uniqueIdHolder.a(savedInstanceState);
        if (savedInstanceState != null) {
            a((String) null, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "onCreateView", null, 4, null);
        return inflater.inflate(R$layout.sns_form_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "onDestroy", null, 4, null);
        i();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "onDestroyView", null, 4, null);
        RecyclerView e10 = e();
        if (e10 != null) {
            e10.setAdapter(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        RecyclerView.n layoutManager;
        String b9;
        super.onSaveInstanceState(outState);
        this.uniqueIdHolder.b(outState);
        a aVar = this.observer;
        if (aVar != null && (b9 = aVar.b()) != null) {
            outState.putString("OBSERVER_ITEM_ID", b9);
        }
        RecyclerView e10 = e();
        outState.putParcelable("SCROLL_STATE", (e10 == null || (layoutManager = e10.getLayoutManager()) == null) ? null : layoutManager.onSaveInstanceState());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        StateFlow<b.a> b9;
        super.onViewCreated(view, savedInstanceState);
        RecyclerView e10 = e();
        if (e10 != null) {
            this.listLayoutManager = new LinearLayoutManager(e10.getContext());
            e10.setLayoutManager(new LinearLayoutManager(e10.getContext()));
            com.sumsub.sns.core.presentation.form.viewadapter.i iVar = new com.sumsub.sns.core.presentation.form.viewadapter.i(this.itemValueProvider);
            iVar.a(this.fieldViewCallback);
            this.formItemAdapter = iVar;
            e10.setAdapter(iVar);
            RecyclerView.k itemAnimator = e10.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.f7496f = 100L;
            }
            RecyclerView.k itemAnimator2 = e10.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.f7493c = 100L;
            }
            RecyclerView.k itemAnimator3 = e10.getItemAnimator();
            if (itemAnimator3 != null) {
                itemAnimator3.f7494d = 100L;
            }
            RecyclerView.k itemAnimator4 = e10.getItemAnimator();
            if (itemAnimator4 != null) {
                itemAnimator4.f7495e = 100L;
            }
        }
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        String f10 = f();
        StringBuilder sb2 = new StringBuilder("onViewCreated: viewModel=");
        com.sumsub.sns.internal.core.presentation.form.b c2 = c();
        sb2.append(c2 != null ? com.sumsub.sns.internal.core.common.i.a(c2) : null);
        Logger.v$default(aVar, f10, sb2.toString(), null, 4, null);
        com.sumsub.sns.internal.core.presentation.form.b c10 = c();
        if (c10 == null || (b9 = c10.b()) == null) {
            return;
        }
        b0.b(b9, this, new e(savedInstanceState, null));
    }

    public final ViewGroup b() {
        return e();
    }

    public final com.sumsub.sns.internal.core.presentation.form.b c() {
        com.sumsub.sns.internal.core.presentation.form.b a10;
        X parentFragment = getParentFragment();
        com.sumsub.sns.internal.core.presentation.form.a aVar = parentFragment instanceof com.sumsub.sns.internal.core.presentation.form.a ? (com.sumsub.sns.internal.core.presentation.form.a) parentFragment : null;
        if (aVar != null && (a10 = aVar.a()) != null) {
            return a10;
        }
        LayoutInflater.Factory activity = getActivity();
        com.sumsub.sns.internal.core.presentation.form.a aVar2 = activity instanceof com.sumsub.sns.internal.core.presentation.form.a ? (com.sumsub.sns.internal.core.presentation.form.a) activity : null;
        if (aVar2 != null) {
            return aVar2.a();
        }
        return null;
    }

    public final com.sumsub.sns.internal.core.presentation.form.d d() {
        return (com.sumsub.sns.internal.core.presentation.form.d) this.itemValueCache.getValue();
    }

    public final RecyclerView e() {
        return (RecyclerView) this.list.a(this, f14174q[2]);
    }

    public final String f() {
        return a() + "::FormFragment";
    }

    public final TextView g() {
        return (TextView) this.tvSubtitle.a(this, f14174q[1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r5 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.sumsub.sns.internal.core.presentation.form.b.C0241b r11) {
        /*
            r10 = this;
            com.sumsub.sns.internal.core.presentation.form.b$b r0 = r10.page
            boolean r0 = kotlin.jvm.internal.f.b(r0, r11)
            if (r0 == 0) goto L17
            com.sumsub.sns.internal.log.a r1 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r2 = r10.f()
            r5 = 4
            r6 = 0
            java.lang.String r3 = "skipping page update"
            r4 = 0
            com.sumsub.log.logger.Logger.v$default(r1, r2, r3, r4, r5, r6)
            return
        L17:
            boolean r0 = r10.isAdded()
            if (r0 != 0) goto L1e
            return
        L1e:
            com.sumsub.sns.internal.log.a r1 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r2 = r10.f()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "creating views for page "
            r0.<init>(r3)
            int r3 = r11.e()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5 = 4
            r6 = 0
            r4 = 0
            com.sumsub.log.logger.Logger.v$default(r1, r2, r3, r4, r5, r6)
            r0 = 1
            r10.disableSubmitModelUpdates = r0
            java.util.Map r1 = kotlin.collections.a.p()
            r10.itemErrorMap = r1
            r10.j()
            java.util.List<? extends com.sumsub.sns.internal.core.presentation.form.model.FormItem> r1 = r10.visibleItems
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbe
            java.lang.Object r2 = r1.next()
            com.sumsub.sns.internal.core.presentation.form.model.FormItem r2 = (com.sumsub.sns.internal.core.presentation.form.model.FormItem) r2
            com.sumsub.sns.internal.core.common.e0 r3 = com.sumsub.sns.internal.core.common.e0.f15081a
            boolean r3 = r3.isDebug()
            if (r3 == 0) goto L4e
            com.sumsub.sns.internal.log.a r3 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r5 = r10.f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "showing view for "
            r4.<init>(r6)
            java.lang.String r6 = r2.k()
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r3
            com.sumsub.log.logger.Logger.v$default(r4, r5, r6, r7, r8, r9)
            java.lang.String r4 = r2.f()
            if (r4 != 0) goto L96
            java.util.List r4 = r2.g()
            if (r4 == 0) goto L95
            boolean r5 = r4.isEmpty()
            r5 = r5 ^ r0
            if (r5 == 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L4e
            java.lang.String r5 = r10.f()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "initial value for "
            r6.<init>(r7)
            java.lang.String r2 = r2.k()
            r6.append(r2)
            java.lang.String r2 = " = "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r3
            com.sumsub.log.logger.Logger.v$default(r4, r5, r6, r7, r8, r9)
            goto L4e
        Lbe:
            r0 = 0
            r10.disableSubmitModelUpdates = r0
            r10.page = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.form.d.b(com.sumsub.sns.internal.core.presentation.form.b$b):void");
    }

    public final String a() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("client_tag") : null;
        return string == null ? "_" : string;
    }

    public static final void a(d dVar, int i9) {
        RecyclerView e10 = dVar.e();
        if (e10 != null) {
            e10.scrollToPosition(i9);
        }
    }

    public final void a(b.a state, Bundle savedInstanceState) {
        Parcelable parcelable;
        RecyclerView.n layoutManager;
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "handleFormStateUpdated:", null, 4, null);
        if (!state.h().isEmpty()) {
            a aVar = this.observer;
            if ((aVar != null ? aVar.a() : null) == null) {
                i();
            }
            a(state.g(), savedInstanceState);
        }
        a(state.f(), state.h());
        b.C0241b e10 = state.e();
        if (e10 != null) {
            if ((e10.f().isEmpty() ^ true ? e10 : null) == null || savedInstanceState == null || (parcelable = (Parcelable) C1275b.a(savedInstanceState, Parcelable.class, "SCROLL_STATE")) == null || this.scrollRestored) {
                return;
            }
            RecyclerView e11 = e();
            if (e11 != null && (layoutManager = e11.getLayoutManager()) != null) {
                layoutManager.onRestoreInstanceState(parcelable);
            }
            this.scrollRestored = true;
        }
    }

    public final void a(String mimeTypes, Bundle savedInstanceState) {
        String string;
        if (this.observer != null) {
            return;
        }
        androidx.activity.result.a activityResultRegistry = requireActivity().getActivityResultRegistry();
        String a10 = this.uniqueIdHolder.a();
        if (mimeTypes == null) {
            mimeTypes = getString(R$string.sns_questionnaire_mime_types);
        }
        a aVar = new a(activityResultRegistry, a10, com.sumsub.sns.internal.core.common.h.a(mimeTypes), new f(), new g());
        if (savedInstanceState != null && (string = savedInstanceState.getString("OBSERVER_ITEM_ID")) != null) {
            aVar.c(string);
        }
        getLifecycle().a(aVar);
        this.observer = aVar;
    }

    public final void a(int currentPageNumber, List<b.C0241b> pages) {
        String N10;
        List<FormItem> f10;
        b.C0241b c0241b = (b.C0241b) s.M(currentPageNumber, pages);
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        String f11 = f();
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("showPage: ", currentPageNumber, " has ");
        Spanned spanned = null;
        l10.append((c0241b == null || (f10 = c0241b.f()) == null) ? null : Integer.valueOf(f10.size()));
        l10.append(" items");
        Logger.v$default(aVar, f11, l10.toString(), null, 4, null);
        if (pages.isEmpty() || c0241b == null) {
            return;
        }
        TextView h9 = h();
        if (h9 != null) {
            String h10 = c0241b.h();
            com.sumsub.sns.internal.core.common.i.a(h9, h10 != null ? com.sumsub.sns.internal.core.common.i.a(h10, requireContext()) : null);
        }
        TextView g10 = g();
        if (g10 != null) {
            String g11 = c0241b.g();
            if (g11 != null && (N10 = C0963h.N(g11)) != null) {
                spanned = com.sumsub.sns.internal.core.common.i.a(N10, requireContext());
            }
            com.sumsub.sns.internal.core.common.i.a(g10, spanned);
        }
        TextView h11 = h();
        if (h11 != null) {
            com.sumsub.sns.core.common.b.a(h11, new h());
        }
        TextView g12 = g();
        if (g12 != null) {
            com.sumsub.sns.core.common.b.a(g12, new i());
        }
        b(c0241b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Iterable, java.util.Collection, java.util.List<? extends com.sumsub.sns.internal.core.presentation.form.model.FormItem>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List<com.sumsub.sns.internal.core.presentation.form.model.FormItem>] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    public final List<FormItem> a(List<? extends FormItem> list) {
        StateFlow<b.a> b9;
        b.a value;
        List<b.C0241b> h9;
        FieldId b10;
        FieldId b11;
        com.sumsub.sns.internal.core.presentation.form.b c2 = c();
        if (c2 != null && (b9 = c2.b()) != null && (value = b9.getValue()) != null && (h9 = value.h()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = h9.iterator();
            while (it.hasNext()) {
                q.x(arrayList, ((b.C0241b) it.next()).f());
            }
            b.a a10 = com.sumsub.sns.internal.core.presentation.form.model.b.f16574a.a(arrayList, d());
            Set<String> a11 = a10.a();
            Set<FieldId> b12 = a10.b();
            if (!a11.isEmpty()) {
                Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "hidden sections: " + a11.size(), null, 4, null);
            }
            if (e0.f15081a.isDebug()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    b11 = com.sumsub.sns.core.presentation.form.e.b((FormItem) obj);
                    if (b12.contains(b11)) {
                        arrayList2.add(obj);
                    }
                }
                Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "hidden items: " + arrayList2.size(), null, 4, null);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    FormItem formItem = (FormItem) it2.next();
                    Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "hidden " + formItem, null, 4, null);
                }
            }
            ArrayList arrayList3 = new ArrayList((Collection) list);
            list = new ArrayList<>();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                FormItem formItem2 = (FormItem) next;
                boolean z10 = formItem2 instanceof FormItem.l;
                if (!z10 || a11.contains(((FormItem.l) formItem2).e())) {
                    if (!z10) {
                        b10 = com.sumsub.sns.core.presentation.form.e.b(formItem2);
                        if (!b12.contains(b10)) {
                        }
                    }
                }
                list.add(next);
            }
        }
        return list;
    }

    public final List<FormItem> a(b.C0241b page) {
        List<FormItem> f10 = page.f();
        ArrayList arrayList = new ArrayList();
        String h9 = page.h();
        if (h9 != null) {
            arrayList.add(new FormItem.r(h9, ""));
        }
        String g10 = page.g();
        if (g10 != null) {
            arrayList.add(new FormItem.o(g10, ""));
        }
        arrayList.addAll(f10);
        return arrayList;
    }

    public final void a(String requestId, List<? extends Uri> uris) {
        com.sumsub.sns.internal.core.presentation.form.b c2;
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "handleMultiFilePickResult: " + requestId + " -> " + uris, null, 4, null);
        if (uris == null || uris.isEmpty()) {
            return;
        }
        try {
            AbstractC1244a a10 = x.a(false, 1, null);
            FieldId fieldId = (FieldId) a10.c(j3.e.B(a10.f27066b, kotlin.jvm.internal.h.b(FieldId.class)), requestId);
            if (fieldId == null || (c2 = c()) == null) {
                return;
            }
            c2.a(requireContext(), fieldId, uris);
        } catch (Throwable unused) {
        }
    }

    public final void a(String requestId, Uri uri) {
        com.sumsub.sns.internal.core.presentation.form.b c2;
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, f(), "handleFilePickResult: " + requestId + " -> " + uri, null, 4, null);
        if (uri == null) {
            return;
        }
        try {
            AbstractC1244a a10 = x.a(false, 1, null);
            FieldId fieldId = (FieldId) a10.c(j3.e.B(a10.f27066b, kotlin.jvm.internal.h.b(FieldId.class)), requestId);
            if (fieldId == null || (c2 = c()) == null) {
                return;
            }
            c2.a(requireContext(), fieldId, Collections.singletonList(uri));
        } catch (Throwable unused) {
        }
    }
}
