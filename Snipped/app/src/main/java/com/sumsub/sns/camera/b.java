package com.sumsub.sns.camera;

import O9.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.camera.b;
import com.sumsub.sns.internal.camera.c;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.h;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.j;
import com.sumsub.sns.internal.core.common.l;
import e.AbstractC0704c;
import java.util.Map;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\b&\u0018\u0000 3*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u0016\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001f\u0010\u0005R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\r8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/sumsub/sns/camera/b;", "Lcom/sumsub/sns/internal/camera/b;", "VM", "Lcom/sumsub/sns/camera/a;", "<init>", "()V", "", "", "", "grantResults", "LO9/p;", "handlePermissionResults", "(Ljava/util/Map;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lcom/sumsub/sns/internal/camera/c$b;", "state", "a", "(Lcom/sumsub/sns/internal/camera/c$b;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Landroid/net/Uri;", "uri", "(Landroid/net/Uri;)V", "K", "L", "Lcom/sumsub/sns/internal/core/android/a;", "j", "Lcom/sumsub/sns/internal/core/android/a;", "pickerLifecycleObserver", "Landroidx/appcompat/app/b;", "k", "Landroidx/appcompat/app/b;", "lackOfPermissionsDialog", "Le/c;", "", "l", "Le/c;", "permissionLauncher", "J", "()Landroid/view/View;", "takeGalleryView", "I", "()Ljava/lang/String;", "pickerMimeType", "m", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class b<VM extends com.sumsub.sns.internal.camera.b> extends a<VM> {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.internal.core.android.a pickerLifecycleObserver;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public androidx.appcompat.app.b lackOfPermissionsDialog;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public AbstractC0704c<String[]> permissionLauncher;

    /* renamed from: com.sumsub.sns.camera.b$b, reason: collision with other inner class name */
    public static final class C0147b extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<VM> f13853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0147b(b<VM> bVar) {
            super(0);
            this.f13853a = bVar;
        }

        public final void a() {
            this.f13853a.L();
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0650p<String, Uri, p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<VM> f13854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<VM> bVar) {
            super(2);
            this.f13854a = bVar;
        }

        public final void a(String str, Uri uri) {
            this.f13854a.a(uri);
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ p invoke(String str, Uri uri) {
            a(str, uri);
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.camera.SNSCameraPhotoFragment$onViewCreated$4", f = "SNSCameraPhotoFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13855a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13856b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<VM> f13857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<VM> bVar, T9.a<? super d> aVar) {
            super(2, aVar);
            this.f13857c = bVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.a aVar, T9.a<? super p> aVar2) {
            return ((d) create(aVar, aVar2)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            d dVar = new d(this.f13857c, aVar);
            dVar.f13856b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f13855a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.a aVar = (b.a) this.f13856b;
            b<VM> bVar = this.f13857c;
            bVar.lackOfPermissionsDialog = new SNSAlertDialogBuilder(bVar.requireContext()).setMessage(aVar.f()).setPositiveButton(aVar.e(), (DialogInterface.OnClickListener) null).setNeutralButton(aVar.d(), (DialogInterface.OnClickListener) new com.sumsub.sns.camera.d(this.f13857c, 0)).create();
            return p.f3034a;
        }

        public static final void a(b bVar, DialogInterface dialogInterface, int i) {
            i.a((Activity) bVar.requireActivity());
        }
    }

    private final void handlePermissionResults(Map<String, Boolean> grantResults) {
        androidx.appcompat.app.b bVar;
        if (f.b(grantResults.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
            K();
        } else {
            if (!f.b(grantResults.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.FALSE) || (bVar = this.lackOfPermissionsDialog) == null) {
                return;
            }
            bVar.show();
        }
    }

    public final String I() {
        return getResources().getString(R$string.sns_gallery_type);
    }

    public abstract View J();

    /* JADX WARN: Multi-variable type inference failed */
    public final void K() {
        com.sumsub.sns.internal.core.android.a aVar = this.pickerLifecycleObserver;
        if (aVar == null || aVar.a(String.valueOf(System.currentTimeMillis()))) {
            return;
        }
        ((com.sumsub.sns.internal.camera.b) getViewModel()).B();
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void L() {
        if (Build.VERSION.SDK_INT > 28 || j.a(requireContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
            K();
            return;
        }
        AbstractC0704c<String[]> abstractC0704c = this.permissionLauncher;
        if (abstractC0704c != null) {
            abstractC0704c.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.b bVar = this.lackOfPermissionsDialog;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.lackOfPermissionsDialog = null;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        String b9;
        com.sumsub.sns.internal.core.android.a aVar = this.pickerLifecycleObserver;
        if (aVar != null && (b9 = aVar.b()) != null) {
            outState.putString("last_picker_request_id", b9);
        }
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.camera.a, com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        p pVar;
        Integer a10;
        super.onViewCreated(view, savedInstanceState);
        View J3 = J();
        if (J3 != null) {
            J3.setVisibility(((com.sumsub.sns.internal.camera.b) getViewModel()).z() ? 0 : 8);
            Drawable onResolveIcon = e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.GALLERY.getImageName());
            com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
            if (a11 == null || (a10 = aVar.a(a11, sNSColorElement, aVar.a(J3))) == null) {
                pVar = null;
            } else {
                int intValue = a10.intValue();
                if (onResolveIcon != null) {
                    onResolveIcon.setColorFilter(new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN));
                }
                pVar = p.f3034a;
            }
            if (pVar == null) {
                int color = C0913a.getColor(J3.getContext(), R$color.sns_camera_content);
                if (onResolveIcon != null) {
                    onResolveIcon.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
            }
            ImageView imageView = J3 instanceof ImageView ? (ImageView) J3 : null;
            if (imageView != null) {
                imageView.setImageDrawable(onResolveIcon);
            }
            l.a(J3, new C0147b(this));
        }
        com.sumsub.sns.internal.core.android.a aVar2 = new com.sumsub.sns.internal.core.android.a(requireActivity().getActivityResultRegistry(), null, h.a(I()), new c(this), null, 18, null);
        if (savedInstanceState != null && (string = savedInstanceState.getString("last_picker_request_id")) != null) {
            aVar2.c(string);
        }
        getLifecycle().a(aVar2);
        this.pickerLifecycleObserver = aVar2;
        b0.b(((com.sumsub.sns.internal.camera.b) getViewModel()).A(), this, new d(this, null));
        this.permissionLauncher = registerForActivityResult(new f.f(), new A0.b(this, 26));
    }

    public static final void a(b bVar, Map map) {
        bVar.handlePermissionResults(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.camera.a
    public void a(c.b state) {
        View J3 = J();
        if (J3 == null) {
            return;
        }
        J3.setVisibility((state.j() && ((com.sumsub.sns.internal.camera.b) getViewModel()).z()) ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            ((com.sumsub.sns.internal.camera.b) getViewModel()).a(requireContext().getApplicationContext(), I(), uri);
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
            String a10 = com.sumsub.sns.internal.log.c.a(this);
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(a10, message, e10);
        }
    }
}
