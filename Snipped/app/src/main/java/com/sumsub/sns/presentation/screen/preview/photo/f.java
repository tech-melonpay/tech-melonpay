package com.sumsub.sns.presentation.screen.preview.photo;

import O9.p;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.s;
import androidx.lifecycle.C0552s;
import androidx.viewpager2.widget.ViewPager2;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.camera.photo.presentation.document.a;
import com.sumsub.sns.camera.photo.presentation.selfie.a;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.b;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.d1;
import com.sumsub.sns.internal.core.common.f0;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.n;
import com.sumsub.sns.internal.ml.core.e;
import com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel;
import ia.InterfaceC0840h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import ka.C0963h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b&\u0018\u0000 C*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0011J\u001d\u0010\n\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\n\u0010\u0015J\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\n\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\n\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J!\u0010&\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b\n\u0010+J\u0019\u0010,\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010\u0006J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u0010-J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b\n\u00105J\u0017\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u0010\u000bJ\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010\u0006J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<R\u001d\u0010A\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010E\u001a\u0004\u0018\u00010B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010N\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010>\u001a\u0004\bL\u0010MR\u001d\u0010S\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010RR\u001d\u0010X\u001a\u0004\u0018\u00010T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010>\u001a\u0004\bV\u0010WR\u001d\u0010[\u001a\u0004\u0018\u00010T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010>\u001a\u0004\bZ\u0010WR\u001d\u0010`\u001a\u0004\u0018\u00010\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b^\u0010_R\u001d\u0010e\u001a\u0004\u0018\u00010a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010>\u001a\u0004\bc\u0010dR\u001d\u0010h\u001a\u0004\u0018\u00010a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010>\u001a\u0004\bg\u0010dR\u001d\u0010j\u001a\u0004\u0018\u00010a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bi\u0010dR\u001d\u0010o\u001a\u0004\u0018\u00010k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010>\u001a\u0004\bm\u0010nR\u001d\u0010s\u001a\u0004\u0018\u00010p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010>\u001a\u0004\bq\u0010rR\u001d\u0010t\u001a\u0004\u0018\u00010p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\bl\u0010rR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010yR\u0016\u0010|\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010{R\u0016\u0010~\u001a\u0004\u0018\u00010a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b}\u0010dR%\u0010\u0084\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u0010\u0086\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R%\u0010\u0088\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001R%\u0010\u008a\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/photo/f;", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel;", "VM", "Lcom/sumsub/sns/presentation/screen/preview/a;", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$g;", "<init>", "()V", "", "clockWise", "LO9/p;", "a", "(Z)V", "Lcom/sumsub/sns/internal/ml/core/e$a;", "Lcom/sumsub/sns/internal/ml/badphotos/models/a;", "res", "(Lcom/sumsub/sns/internal/ml/core/e$a;)V", "state", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$g;)V", "", "Landroid/graphics/Bitmap;", "photoBitmaps", "(Ljava/util/List;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;", "action", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;)V", "z", "x", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$k;", "warning", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$k;)V", "b", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", FirebaseAnalytics.Param.SUCCESS, "Landroid/os/Parcelable;", "payload", "(ZLandroid/os/Parcelable;)V", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "y", "outState", "onSaveInstanceState", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/SNSPreviewPhotoDocumentViewModel$g;Landroid/os/Bundle;)V", "hideLogo", "updatePoweredByVisibility", "onDestroyView", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Landroidx/constraintlayout/widget/Group;", "Lcom/sumsub/sns/internal/core/common/z;", "o", "()Landroidx/constraintlayout/widget/Group;", "gContent", "Landroidx/viewpager2/widget/ViewPager2;", "r", "()Landroidx/viewpager2/widget/ViewPager2;", "photosPager", "Lcom/sumsub/sns/presentation/screen/preview/photo/c;", "c", "Lcom/sumsub/sns/presentation/screen/preview/photo/c;", "photosAdapter", "Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", "d", "q", "()Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", "ivPhoto", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "e", "v", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "uploadProgress", "Landroid/widget/Button;", "f", "k", "()Landroid/widget/Button;", "btnReadableDocument", "g", "n", "btnTakeAnotherPhoto", "Lcom/sumsub/sns/core/widget/SNSImageView;", "h", "p", "()Lcom/sumsub/sns/core/widget/SNSImageView;", "ivContentIcon", "Landroid/widget/TextView;", "i", "u", "()Landroid/widget/TextView;", "tvTitle", "j", "t", "tvSubtitle", "s", "tvIdDoc", "Landroid/view/ViewGroup;", "l", "w", "()Landroid/view/ViewGroup;", "vgWarning", "Landroid/widget/ImageButton;", "m", "()Landroid/widget/ImageButton;", "btnRotateCW", "btnRotateCCW", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bsbWarning", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "bottomSheetJob", "I", "currentPage", "getPoweredByText", "poweredByText", "", "", "", "getCancelPayload", "()Ljava/util/Map;", "cancelPayload", "getClosePayload", "closePayload", "getOpenPayload", "openPayload", "getAppearPayload", "appearPayload", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class f<VM extends SNSPreviewPhotoDocumentViewModel> extends com.sumsub.sns.presentation.screen.preview.a<SNSPreviewPhotoDocumentViewModel.g, VM> {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f20042s;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.presentation.screen.preview.photo.c photosAdapter;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public BottomSheetBehavior<ViewGroup> bsbWarning;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public Job bottomSheetJob;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int currentPage;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final z gContent = a0.a(this, R$id.sns_content);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z photosPager = a0.a(this, R$id.sns_photos);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z ivPhoto = a0.a(this, R$id.sns_photo);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z uploadProgress = a0.a(this, R$id.sns_upload_progress);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z btnReadableDocument = a0.a(this, R$id.sns_primary_button);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z btnTakeAnotherPhoto = a0.a(this, R$id.sns_secondary_button);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final z ivContentIcon = a0.a(this, R$id.sns_content_icon);

    /* renamed from: i, reason: from kotlin metadata */
    public final z tvTitle = a0.a(this, R$id.sns_title);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final z tvSubtitle = a0.a(this, R$id.sns_subtitle);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final z tvIdDoc = a0.a(this, R$id.sns_iddoc);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final z vgWarning = a0.a(this, R$id.sns_warning);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final z btnRotateCW = a0.a(this, R$id.sns_rotate_cw);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final z btnRotateCCW = a0.a(this, R$id.sns_rotate_ccw);

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20059a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20060b;

        static {
            int[] iArr = new int[SNSPreviewPhotoDocumentViewModel.Content.Icon.values().length];
            iArr[SNSPreviewPhotoDocumentViewModel.Content.Icon.WARNING.ordinal()] = 1;
            f20059a = iArr;
            int[] iArr2 = new int[SNSPreviewPhotoDocumentViewModel.Content.ButtonAction.values().length];
            iArr2[SNSPreviewPhotoDocumentViewModel.Content.ButtonAction.CONTINUE.ordinal()] = 1;
            iArr2[SNSPreviewPhotoDocumentViewModel.Content.ButtonAction.TRY_AGAIN.ordinal()] = 2;
            f20060b = iArr2;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.preview.photo.SNSPreviewPhotoDocumentFragment$hideWarning$1", f = "SNSPreviewPhotoDocumentFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20061a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f<VM> f20062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f<VM> fVar, T9.a<? super c> aVar) {
            super(2, aVar);
            this.f20062b = fVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new c(this.f20062b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f20061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            BottomSheetBehavior bottomSheetBehavior = this.f20062b.bsbWarning;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.f20062b.bsbWarning;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(5);
            }
            TextView s10 = this.f20062b.s();
            if (s10 != null) {
                s10.setVisibility(8);
            }
            return p.f3034a;
        }
    }

    public static final class d extends ViewPager2.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<VM> f20063a;

        public d(f<VM> fVar) {
            this.f20063a = fVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void onPageSelected(int i) {
            this.f20063a.currentPage = i;
            f.f(this.f20063a).a(i);
        }
    }

    public static final class e extends Lambda implements InterfaceC0650p<Integer, com.sumsub.sns.presentation.screen.preview.photo.b, p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<VM> f20064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f<VM> fVar) {
            super(2);
            this.f20064a = fVar;
        }

        public final void a(int i, com.sumsub.sns.presentation.screen.preview.photo.b bVar) {
            k0 appListener;
            File d10 = bVar.d();
            if (d10 == null || (appListener = this.f20064a.getAppListener()) == null) {
                return;
            }
            appListener.a(d10, bVar.f(), this.f20064a.getIdDocSetType(), "request_image_rotation");
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ p invoke(Integer num, com.sumsub.sns.presentation.screen.preview.photo.b bVar) {
            a(num.intValue(), bVar);
            return p.f3034a;
        }
    }

    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f20066a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f20067b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f20068c;

        public g(View view, f fVar, List list) {
            this.f20066a = view;
            this.f20067b = fVar;
            this.f20068c = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20067b.a((List<Bitmap>) this.f20068c);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.preview.photo.SNSPreviewPhotoDocumentFragment$showWarning$1", f = "SNSPreviewPhotoDocumentFragment.kt", l = {576}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20069a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f<VM> f20070b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSPreviewPhotoDocumentViewModel.k f20071c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f<VM> fVar, SNSPreviewPhotoDocumentViewModel.k kVar, T9.a<? super h> aVar) {
            super(2, aVar);
            this.f20070b = fVar;
            this.f20071c = kVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((h) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new h(this.f20070b, this.f20071c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f20069a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.f20070b.b(this.f20071c);
                this.f20069a = 1;
                if (DelayKt.delay(300L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            BottomSheetBehavior bottomSheetBehavior = this.f20070b.bsbWarning;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(3);
            }
            return p.f3034a;
        }
    }

    public static final class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f20072a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f20073b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f20074c;

        public i(View view, TextView textView, f fVar) {
            this.f20072a = view;
            this.f20073b = textView;
            this.f20074c = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView textView = this.f20073b;
            int height = textView != null ? textView.getHeight() : 0;
            BottomSheetBehavior bottomSheetBehavior = this.f20074c.bsbWarning;
            if (bottomSheetBehavior == null) {
                return;
            }
            ViewGroup w2 = this.f20074c.w();
            bottomSheetBehavior.setPeekHeight((w2 != null ? w2.getHeight() : 0) - height);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(f.class, "gContent", "getGContent()Landroidx/constraintlayout/widget/Group;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f20042s = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, f.class, "photosPager", "getPhotosPager()Landroidx/viewpager2/widget/ViewPager2;", 0), com.google.android.gms.measurement.internal.a.o(f.class, "ivPhoto", "getIvPhoto()Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "uploadProgress", "getUploadProgress()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "btnReadableDocument", "getBtnReadableDocument()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "btnTakeAnotherPhoto", "getBtnTakeAnotherPhoto()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "ivContentIcon", "getIvContentIcon()Lcom/sumsub/sns/core/widget/SNSImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "tvIdDoc", "getTvIdDoc()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "vgWarning", "getVgWarning()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "btnRotateCW", "getBtnRotateCW()Landroid/widget/ImageButton;", 0, iVar), com.google.android.gms.measurement.internal.a.o(f.class, "btnRotateCCW", "getBtnRotateCCW()Landroid/widget/ImageButton;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SNSPreviewPhotoDocumentViewModel f(f fVar) {
        return (SNSPreviewPhotoDocumentViewModel) fVar.getViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return ((SNSPreviewPhotoDocumentViewModel) getViewModel()).E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return ((SNSPreviewPhotoDocumentViewModel) getViewModel()).E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return ((SNSPreviewPhotoDocumentViewModel) getViewModel()).E();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_preview_photo_document;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return ((SNSPreviewPhotoDocumentViewModel) getViewModel()).E();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public TextView getPoweredByText() {
        ViewGroup w2 = w();
        if (w2 != null) {
            return (TextView) w2.findViewById(R$id.sns_powered);
        }
        return null;
    }

    @Override // com.sumsub.sns.presentation.screen.preview.a, com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        super.handleEvent(event);
        if (event instanceof SNSPreviewPhotoDocumentViewModel.h) {
            if (isAdded()) {
                SNSPreviewPhotoDocumentViewModel.h hVar = (SNSPreviewPhotoDocumentViewModel.h) event;
                final int i9 = 0;
                final int i10 = 1;
                new SNSAlertDialogBuilder(requireContext()).setMessage(hVar.f()).setPositiveButton(hVar.e(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.k

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f20095b;

                    {
                        this.f20095b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        switch (i9) {
                            case 0:
                                f.a(this.f20095b, dialogInterface, i11);
                                break;
                            default:
                                f.b(this.f20095b, dialogInterface, i11);
                                break;
                        }
                    }
                }).setNegativeButton(hVar.d(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.k

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f20095b;

                    {
                        this.f20095b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        switch (i10) {
                            case 0:
                                f.a(this.f20095b, dialogInterface, i11);
                                break;
                            default:
                                f.b(this.f20095b, dialogInterface, i11);
                                break;
                        }
                    }
                }).show();
                return;
            }
            return;
        }
        if (event instanceof SNSPreviewPhotoDocumentViewModel.e.a) {
            a.Companion companion = com.sumsub.sns.camera.photo.presentation.document.a.INSTANCE;
            SNSPreviewPhotoDocumentViewModel.e.a aVar = (SNSPreviewPhotoDocumentViewModel.e.a) event;
            navigateTo(companion.a(aVar.b().p(), aVar.b().i().getType(), aVar.b().o(), aVar.b().j(), aVar.b().k(), aVar.b().l(), aVar.b().n(), aVar.b().m()).forResult("request_photo_picker"), com.sumsub.sns.internal.log.c.a(companion));
            return;
        }
        if (event instanceof SNSPreviewPhotoDocumentViewModel.e.b) {
            a.Companion companion2 = com.sumsub.sns.camera.photo.presentation.selfie.a.INSTANCE;
            SNSPreviewPhotoDocumentViewModel.e.b bVar = (SNSPreviewPhotoDocumentViewModel.e.b) event;
            navigateTo(companion2.a(bVar.b().i().getType(), bVar.b().j()).forResult("request_photo_picker"), com.sumsub.sns.internal.log.c.a(companion2));
            return;
        }
        if (!(event instanceof SNSPreviewPhotoDocumentViewModel.c)) {
            if (event instanceof SNSPreviewPhotoDocumentViewModel.j) {
                a(((SNSPreviewPhotoDocumentViewModel.j) event).b());
                return;
            } else {
                if (event instanceof SNSPreviewPhotoDocumentViewModel.i) {
                    SNSPreviewPhotoDocumentViewModel.i iVar = (SNSPreviewPhotoDocumentViewModel.i) event;
                    a(iVar.c(), iVar.d());
                    return;
                }
                return;
            }
        }
        Context context = getContext();
        f0 d10 = context != null ? com.sumsub.sns.internal.core.common.i.d(context) : null;
        com.sumsub.sns.internal.log.a aVar2 = com.sumsub.sns.internal.log.a.f17535a;
        StringBuilder sb2 = new StringBuilder("NFC message: ");
        sb2.append(d10 != null ? d10.a() : null);
        Logger.e$default(aVar2, "SumSubNfc", sb2.toString(), null, 4, null);
        if (d10 instanceof f0.b) {
            k0 appListener = getAppListener();
            if (appListener != null) {
                appListener.a(((SNSPreviewPhotoDocumentViewModel.c) event).b());
                return;
            }
            return;
        }
        k0 appListener2 = getAppListener();
        if (appListener2 != null) {
            appListener2.a(((SNSPreviewPhotoDocumentViewModel.c) event).b().j().getType());
        }
        if (d10 instanceof f0.c) {
            aVar2.e("SumSubNfc", "NFC Error", ((f0.c) d10).b());
        }
    }

    public final Button k() {
        return (Button) this.btnReadableDocument.a(this, f20042s[4]);
    }

    public final ImageButton l() {
        return (ImageButton) this.btnRotateCCW.a(this, f20042s[12]);
    }

    public final ImageButton m() {
        return (ImageButton) this.btnRotateCW.a(this, f20042s[11]);
    }

    public final Button n() {
        return (Button) this.btnTakeAnotherPhoto.a(this, f20042s[5]);
    }

    public final Group o() {
        return (Group) this.gContent.a(this, f20042s[0]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.bsbWarning = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "finishing preview screen r=" + finishReason, null, 4, null);
        ((SNSPreviewPhotoDocumentViewModel) getViewModel()).K();
        return super.onFinishCalled(finishReason);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("current_page", this.currentPage);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Integer a10;
        Integer a11;
        super.onViewCreated(view, savedInstanceState);
        ViewPager2 r8 = r();
        if (r8 != null) {
            r8.setOffscreenPageLimit(2);
        }
        ViewPager2 r10 = r();
        if (r10 != null) {
            r10.f8014c.f8046b.add(new d(this));
        }
        com.sumsub.sns.presentation.screen.preview.photo.c cVar = new com.sumsub.sns.presentation.screen.preview.photo.c();
        cVar.a(new e(this));
        this.photosAdapter = cVar;
        ViewPager2 r11 = r();
        if (r11 != null) {
            r11.setAdapter(this.photosAdapter);
        }
        if (savedInstanceState != null) {
            this.currentPage = savedInstanceState.getInt("current_page", 0);
        }
        ImageButton m2 = m();
        if (m2 != null) {
            m2.setVisibility(4);
            final int i9 = 0;
            m2.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f20093b;

                {
                    this.f20093b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i9) {
                        case 0:
                            f.a(this.f20093b, view2);
                            break;
                        default:
                            f.b(this.f20093b, view2);
                            break;
                    }
                }
            });
            m2.setImageDrawable(com.sumsub.sns.core.presentation.helper.a.f14273a.a(requireContext(), SNSIconHandler.SNSCommonIcons.ROTATE_CW.getImageName()));
        }
        ImageButton l10 = l();
        if (l10 != null) {
            l10.setVisibility(4);
            final int i10 = 1;
            l10.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f20093b;

                {
                    this.f20093b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            f.a(this.f20093b, view2);
                            break;
                        default:
                            f.b(this.f20093b, view2);
                            break;
                    }
                }
            });
            l10.setImageDrawable(com.sumsub.sns.core.presentation.helper.a.f14273a.a(requireContext(), SNSIconHandler.SNSCommonIcons.ROTATE_CCW.getImageName()));
        }
        TextView s10 = s();
        if (s10 != null) {
            s10.setVisibility(8);
        }
        LinearProgressIndicator v10 = v();
        if (v10 != null) {
            com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
            SNSColorElement sNSColorElement = SNSColorElement.PROGRESS_BAR_TINT;
            com.sumsub.sns.internal.core.theme.d a12 = aVar.a();
            if (a12 != null && (a11 = aVar.a(a12, sNSColorElement, aVar.a(v10))) != null) {
                v10.setIndicatorColor(a11.intValue(), 0);
            }
            SNSColorElement sNSColorElement2 = SNSColorElement.PROGRESS_BAR_BACKGROUND;
            com.sumsub.sns.internal.core.theme.d a13 = aVar.a();
            if (a13 != null && (a10 = aVar.a(a13, sNSColorElement2, aVar.a(v10))) != null) {
                v10.setTrackColor(a10.intValue());
            }
        }
        z();
    }

    @Override // com.sumsub.sns.presentation.screen.h, com.sumsub.sns.core.presentation.b
    public void onViewModelPrepared(Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        final int i9 = 0;
        requireActivity().getSupportFragmentManager().g0("request_image_rotation", this, new s(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f20076b;

            {
                this.f20076b = this;
            }

            @Override // androidx.fragment.app.s
            public final void b(String str, Bundle bundle) {
                switch (i9) {
                    case 0:
                        f.a(this.f20076b, str, bundle);
                        break;
                    default:
                        f.b(this.f20076b, str, bundle);
                        break;
                }
            }
        });
        final int i10 = 1;
        requireActivity().getSupportFragmentManager().g0("request_photo_picker", this, new s(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f20076b;

            {
                this.f20076b = this;
            }

            @Override // androidx.fragment.app.s
            public final void b(String str, Bundle bundle) {
                switch (i10) {
                    case 0:
                        f.a(this.f20076b, str, bundle);
                        break;
                    default:
                        f.b(this.f20076b, str, bundle);
                        break;
                }
            }
        });
    }

    public final SNSImageView p() {
        return (SNSImageView) this.ivContentIcon.a(this, f20042s[6]);
    }

    public final SNSRotationZoomableImageView q() {
        return (SNSRotationZoomableImageView) this.ivPhoto.a(this, f20042s[2]);
    }

    public final ViewPager2 r() {
        return (ViewPager2) this.photosPager.a(this, f20042s[1]);
    }

    public final TextView s() {
        return (TextView) this.tvIdDoc.a(this, f20042s[9]);
    }

    public final TextView t() {
        return (TextView) this.tvSubtitle.a(this, f20042s[8]);
    }

    public final TextView u() {
        return (TextView) this.tvTitle.a(this, f20042s[7]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void updatePoweredByVisibility(boolean hideLogo) {
        TextView poweredByText = getPoweredByText();
        if (poweredByText != null) {
            poweredByText.setVisibility(hideLogo ? 4 : 0);
        }
        View findViewById = requireView().findViewById(R$id.sns_powered);
        if (findViewById != null) {
            com.sumsub.sns.internal.core.common.i.a(findViewById, hideLogo);
        }
    }

    public final LinearProgressIndicator v() {
        return (LinearProgressIndicator) this.uploadProgress.a(this, f20042s[3]);
    }

    public final ViewGroup w() {
        return (ViewGroup) this.vgWarning.a(this, f20042s[10]);
    }

    public final void x() {
        Job launch$default;
        Job job = this.bottomSheetJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new c(this, null), 3, null);
        this.bottomSheetJob = launch$default;
    }

    public final void z() {
        ViewGroup w2 = w();
        if (w2 == null) {
            return;
        }
        BottomSheetBehavior<ViewGroup> from = BottomSheetBehavior.from(w2);
        from.addBottomSheetCallback(new C0382f(this));
        this.bsbWarning = from;
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, View view) {
        fVar.getAnalyticsDelegate().b(fVar.getScreen(), fVar.getIdDocSetType(), Control.RotateButton, ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).E());
        fVar.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f fVar, View view) {
        fVar.getAnalyticsDelegate().b(fVar.getScreen(), fVar.getIdDocSetType(), Control.RotateButton, ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).E());
        fVar.a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, String str, Bundle bundle) {
        n nVar = (n) bundle.getParcelable("DOCUMENT_RESULT");
        com.sumsub.sns.internal.core.data.model.l lVar = (com.sumsub.sns.internal.core.data.model.l) bundle.getParcelable("DOCUMENT_RESULTS");
        b.Companion companion = com.sumsub.sns.core.presentation.b.INSTANCE;
        if (companion.b(bundle)) {
            if (lVar != null) {
                ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).a(lVar);
                return;
            } else {
                ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).a(nVar);
                return;
            }
        }
        if (companion.a(bundle) == 100) {
            ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).L();
        } else {
            fVar.y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean clockWise) {
        ViewPager2 r8;
        View a10;
        SNSRotationZoomableImageView sNSRotationZoomableImageView;
        ViewPager2 r10 = r();
        if (r10 != null) {
            int currentItem = r10.getCurrentItem();
            com.sumsub.sns.presentation.screen.preview.photo.c cVar = this.photosAdapter;
            if (cVar == null || (r8 = r()) == null || (a10 = d1.a(r8)) == null || (sNSRotationZoomableImageView = (SNSRotationZoomableImageView) a10.findViewById(R$id.sns_photo)) == null) {
                return;
            }
            if (clockWise) {
                sNSRotationZoomableImageView.rotateCW();
            } else {
                sNSRotationZoomableImageView.rotateCCW();
            }
            File d10 = cVar.a().get(currentItem).d();
            if (d10 == null) {
                return;
            }
            ((SNSPreviewPhotoDocumentViewModel) getViewModel()).a(d10, sNSRotationZoomableImageView.getRotation());
        }
    }

    public void y() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, DialogInterface dialogInterface, int i9) {
        ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).d(false);
    }

    public static final void b(f fVar, SNSPreviewPhotoDocumentViewModel.Content content, View view) {
        SNSPreviewPhotoDocumentViewModel.Content.a h9;
        fVar.a((content == null || (h9 = content.h()) == null) ? null : h9.c());
    }

    public final void b(final SNSPreviewPhotoDocumentViewModel.k warning) {
        TextView textView;
        Button button;
        Button button2;
        ViewGroup w2 = w();
        View findViewById = w2 != null ? w2.findViewById(R$id.sns_warning_icon) : null;
        if (findViewById != null) {
            findViewById.setVisibility(warning.j() ? 0 : 8);
        }
        ViewGroup w10 = w();
        TextView textView2 = w10 != null ? (TextView) w10.findViewById(R$id.sns_warning_message) : null;
        if (textView2 != null) {
            com.sumsub.sns.internal.core.common.i.a(textView2, warning.i());
        }
        ViewGroup w11 = w();
        if (w11 != null && (button2 = (Button) w11.findViewById(R$id.sns_warning_primary_button)) != null) {
            com.sumsub.sns.internal.core.common.i.a(button2, warning.g());
            final int i9 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f20078b;

                {
                    this.f20078b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            f.b(this.f20078b, warning, view);
                            break;
                        default:
                            f.a(this.f20078b, warning, view);
                            break;
                    }
                }
            });
        }
        ViewGroup w12 = w();
        if (w12 != null && (button = (Button) w12.findViewById(R$id.sns_warning_secondary_button)) != null) {
            com.sumsub.sns.internal.core.common.i.a(button, warning.h());
            final int i10 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f20078b;

                {
                    this.f20078b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            f.b(this.f20078b, warning, view);
                            break;
                        default:
                            f.a(this.f20078b, warning, view);
                            break;
                    }
                }
            });
        }
        ViewGroup w13 = w();
        if (w13 != null && (textView = (TextView) w13.findViewById(R$id.sns_warning_title)) != null) {
            com.sumsub.sns.internal.core.common.i.a(textView, warning.k());
        }
        ViewGroup w14 = w();
        if (w14 != null) {
            y0.s.a(w14, new i(w14, textView2, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.presentation.screen.h
    public void a(boolean success, Parcelable payload) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "On instructions showed, success=" + success + ", payload=" + payload, null, 4, null);
        if (success) {
            ((SNSPreviewPhotoDocumentViewModel) getViewModel()).a(payload);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f fVar, String str, Bundle bundle) {
        int i9 = bundle.getInt("rotation", 0);
        File file = (File) bundle.getSerializable("file");
        if (file == null) {
            return;
        }
        ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).a(file, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f fVar, DialogInterface dialogInterface, int i9) {
        ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).d(true);
    }

    public final void a(e.a<com.sumsub.sns.internal.ml.badphotos.models.a> res) {
        String str;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (res instanceof e.a.d) {
            StringBuilder sb2 = new StringBuilder("\n                        Result: Success in ");
            e.a.d dVar = (e.a.d) res;
            sb2.append(((com.sumsub.sns.internal.ml.badphotos.models.a) dVar.c()).a());
            sb2.append(" ms\n                        Raw model output: ");
            sb2.append(((com.sumsub.sns.internal.ml.badphotos.models.a) dVar.c()).c());
            sb2.append("\n                    ");
            str = C0963h.N(sb2.toString());
        } else if (res instanceof e.a.b) {
            str = C0963h.N("\n                        Result: Failure\n                        Error: " + ((e.a.b) res).c().getMessage() + "                                        \n                    ");
        } else if (res instanceof e.a.c) {
            str = "Timeout";
        } else if (res instanceof e.a.C0276e) {
            str = "Skipped";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Toast.makeText(context, str, 1).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, SNSPreviewPhotoDocumentViewModel.k kVar, View view) {
        fVar.x();
        if (kVar.l()) {
            return;
        }
        ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).N();
    }

    /* renamed from: com.sumsub.sns.presentation.screen.preview.photo.f$f, reason: collision with other inner class name */
    public static final class C0382f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<VM> f20065a;

        public C0382f(f<VM> fVar) {
            this.f20065a = fVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View view, int i) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.f20065a.getAnalyticsDelegate().a(this.f20065a.getScreen(), (Map<String, ? extends Object>) f.f(this.f20065a).E());
            } else {
                this.f20065a.getAnalyticsDelegate().b(this.f20065a.getScreen(), f.f(this.f20065a).E());
                BottomSheetBehavior bottomSheetBehavior = this.f20065a.bsbWarning;
                if (bottomSheetBehavior == null) {
                    return;
                }
                bottomSheetBehavior.setHideable(false);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View view, float f10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(SNSPreviewPhotoDocumentViewModel.g state, Bundle savedInstanceState) {
        p pVar;
        CharSequence n10;
        SNSImageView p10;
        SNSPreviewPhotoDocumentViewModel.Content.b k3;
        SNSPreviewPhotoDocumentViewModel.Content.a h9;
        int i9;
        SNSPreviewPhotoDocumentViewModel.Content.a i10;
        SNSPreviewPhotoDocumentViewModel.Content.b k10;
        final int i11 = 0;
        if (!state.g().isEmpty()) {
            a(state);
        }
        SNSPreviewPhotoDocumentViewModel.k j10 = state.j();
        if (j10 != null) {
            if (getContext() != null) {
                a(j10);
                TextView s10 = s();
                if (s10 != null) {
                    com.sumsub.sns.internal.core.common.i.a(s10, j10.k());
                }
                com.sumsub.sns.internal.core.common.i.b(u(), t(), k(), n());
            }
            pVar = p.f3034a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            x();
            com.sumsub.sns.internal.core.common.i.c(u(), t(), k(), n());
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "showContent: show=" + state + ".showContent", null, 4, null);
        Group o10 = o();
        if (o10 != null) {
            o10.setVisibility(state.i() ? 0 : 8);
        }
        SNSPreviewPhotoDocumentViewModel.d dVar = (SNSPreviewPhotoDocumentViewModel.d) P9.s.L(state.g());
        if (!state.g().isEmpty()) {
            dVar = (SNSPreviewPhotoDocumentViewModel.d) P9.s.M(this.currentPage, state.g());
        }
        boolean z10 = state.h() && dVar != null && dVar.h();
        ImageButton m2 = m();
        if (m2 != null) {
            m2.setVisibility(z10 ^ true ? 4 : 0);
        }
        ImageButton l10 = l();
        if (l10 != null) {
            l10.setVisibility(z10 ^ true ? 4 : 0);
        }
        final SNSPreviewPhotoDocumentViewModel.Content f10 = state.f();
        updatePoweredByVisibility(((SNSPreviewPhotoDocumentViewModel) getViewModel()).o());
        TextView s11 = s();
        if (s11 != null) {
            s11.setVisibility(8);
        }
        if (state.i()) {
            if (f10 == null || (k10 = f10.k()) == null || (n10 = k10.c()) == null) {
                n10 = f10 != null ? f10.n() : null;
            }
            TextView u6 = u();
            if (u6 != null) {
                com.sumsub.sns.internal.core.common.i.a(u6, n10);
            }
            TextView t3 = t();
            if (t3 != null) {
                com.sumsub.sns.internal.core.common.i.a(t3, f10 != null ? f10.m() : null);
            }
            SNSPreviewPhotoDocumentViewModel.Content.Icon j11 = f10 != null ? f10.j() : null;
            if (j11 == null) {
                SNSImageView p11 = p();
                if (p11 != null) {
                    p11.setVisibility(8);
                }
                TextView t10 = t();
                if (t10 != null) {
                    t10.setGravity(17);
                }
            } else {
                SNSImageView p12 = p();
                if (p12 != null) {
                    p12.setVisibility(0);
                }
                TextView t11 = t();
                if (t11 != null) {
                    t11.setGravity(8388611);
                }
                if (b.f20059a[j11.ordinal()] == 1 && (p10 = p()) != null) {
                    p10.setImageDrawable(com.sumsub.sns.core.presentation.helper.a.f14273a.a(requireContext(), SNSIconHandler.SNSCommonIcons.WARNING.getImageName()));
                }
            }
            Button k11 = k();
            if (k11 != null) {
                k11.setText((f10 == null || (i10 = f10.i()) == null) ? null : i10.d());
                k11.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.i

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f20081b;

                    {
                        this.f20081b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                f.a(this.f20081b, f10, view);
                                break;
                            default:
                                f.b(this.f20081b, f10, view);
                                break;
                        }
                    }
                });
                if (state.j() == null) {
                    if ((f10 != null ? f10.i() : null) != null) {
                        i9 = 0;
                        k11.setVisibility(i9);
                    }
                }
                i9 = 8;
                k11.setVisibility(i9);
            }
            Button n11 = n();
            if (n11 != null) {
                n11.setText((f10 == null || (h9 = f10.h()) == null) ? null : h9.d());
                n11.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.photo.i

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f20081b;

                    {
                        this.f20081b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                f.a(this.f20081b, f10, view);
                                break;
                            default:
                                f.b(this.f20081b, f10, view);
                                break;
                        }
                    }
                });
                n11.setVisibility((f10 != null ? f10.h() : null) != null ? 0 : 8);
            }
            if ((f10 != null ? f10.k() : null) != null) {
                TextView t12 = t();
                if (t12 != null) {
                    t12.setVisibility(4);
                }
                SNSImageView p13 = p();
                if (p13 != null) {
                    p13.setVisibility(8);
                }
            }
            Button k12 = k();
            if (k12 != null) {
                k12.setEnabled((f10 != null ? f10.k() : null) == null);
            }
            Button n12 = n();
            if (n12 != null) {
                n12.setEnabled((f10 != null ? f10.k() : null) == null);
            }
            r6 = (f10 != null ? f10.k() : null) == null ? 0 : 1;
            LinearProgressIndicator v10 = v();
            if (v10 != null) {
                v10.setVisibility(r6 != 0 ? 0 : 8);
                v10.setProgress((f10 == null || (k3 = f10.k()) == null) ? 0 : k3.d());
                ImageButton m9 = m();
                if (m9 != null) {
                    m9.setVisibility(r6 != 0 ? 4 : 0);
                }
                ImageButton l11 = l();
                if (l11 == null) {
                    return;
                }
                l11.setVisibility(r6 == 0 ? 0 : 4);
                return;
            }
            return;
        }
        com.sumsub.sns.internal.core.common.i.a(u(), t(), k(), n(), p(), r(), v());
        SNSRotationZoomableImageView q10 = q();
        if (q10 != null) {
            q10.clearImage();
        }
        com.sumsub.sns.presentation.screen.preview.photo.c cVar = this.photosAdapter;
        if (cVar == null) {
            return;
        }
        cVar.a(EmptyList.f23104a);
    }

    public static final void a(f fVar, SNSPreviewPhotoDocumentViewModel.Content content, View view) {
        SNSPreviewPhotoDocumentViewModel.Content.a i9;
        fVar.a((content == null || (i9 = content.i()) == null) ? null : i9.c());
    }

    public final void a(SNSPreviewPhotoDocumentViewModel.g state) {
        List<SNSPreviewPhotoDocumentViewModel.d> g10 = state.g();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = g10.iterator();
        while (it.hasNext()) {
            Bitmap f10 = ((SNSPreviewPhotoDocumentViewModel.d) it.next()).f();
            if (f10 != null) {
                arrayList.add(f10);
            }
        }
        ViewPager2 r8 = r();
        if (r8 != null) {
            r8.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ViewPager2 r10 = r();
        if (r10 != null && r10.getHeight() > 0) {
            a(arrayList);
        } else {
            ViewPager2 r11 = r();
            if (r11 != null) {
                y0.s.a(r11, new g(r11, this, arrayList));
            }
        }
        List<SNSPreviewPhotoDocumentViewModel.d> g11 = state.g();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : g11) {
            if (((SNSPreviewPhotoDocumentViewModel.d) obj).f() != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(P9.n.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            SNSPreviewPhotoDocumentViewModel.d dVar = (SNSPreviewPhotoDocumentViewModel.d) it2.next();
            Bitmap f11 = dVar.f();
            if (f11 != null) {
                arrayList3.add(new com.sumsub.sns.presentation.screen.preview.photo.b(f11, dVar.e(), dVar.g()));
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        com.sumsub.sns.presentation.screen.preview.photo.c cVar = this.photosAdapter;
        if (cVar != null) {
            cVar.a(arrayList3);
        }
        ViewPager2 r12 = r();
        if (r12 == null) {
            return;
        }
        r12.setCurrentItem(this.currentPage);
    }

    public final void a(List<Bitmap> photoBitmaps) {
        ViewPager2 r8 = r();
        if (r8 != null) {
            int height = r8.getHeight();
            ViewPager2 r10 = r();
            if (r10 == null) {
                return;
            }
            int itemDecorationCount = r10.getItemDecorationCount();
            for (int i9 = 0; i9 < itemDecorationCount; i9++) {
                r10.f8020j.removeItemDecorationAt(0);
            }
            Iterator<T> it = photoBitmaps.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int width = ((Bitmap) next).getWidth();
                    do {
                        Object next2 = it.next();
                        int width2 = ((Bitmap) next2).getWidth();
                        if (width > width2) {
                            next = next2;
                            width = width2;
                        }
                    } while (it.hasNext());
                }
                Bitmap bitmap = (Bitmap) next;
                int width3 = (int) ((getResources().getDisplayMetrics().widthPixels - (bitmap.getWidth() * (height / bitmap.getHeight()))) / 2.0f);
                r10.f8020j.addItemDecoration(new a(width3));
                r10.setPageTransformer(new l(width3, getResources().getDimensionPixelSize(R$dimen.sns_margin_large)));
                return;
            }
            throw new NoSuchElementException();
        }
    }

    public static final void a(int i9, int i10, View view, float f10) {
        view.setTranslationX((i9 + i10) * (-1) * f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(SNSPreviewPhotoDocumentViewModel.Content.ButtonAction action) {
        int i9 = action == null ? -1 : b.f20060b[action.ordinal()];
        if (i9 == 1) {
            getAnalyticsDelegate().b(getScreen(), getIdDocSetType(), Control.AcceptButton, ((SNSPreviewPhotoDocumentViewModel) getViewModel()).E());
            ((SNSPreviewPhotoDocumentViewModel) getViewModel()).x();
        } else {
            if (i9 != 2) {
                return;
            }
            getAnalyticsDelegate().b(getScreen(), getIdDocSetType(), Control.RetakeButton, ((SNSPreviewPhotoDocumentViewModel) getViewModel()).E());
            ((SNSPreviewPhotoDocumentViewModel) getViewModel()).y();
        }
    }

    public final void a(SNSPreviewPhotoDocumentViewModel.k warning) {
        Job launch$default;
        Job job = this.bottomSheetJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.bsbWarning;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new h(this, warning, null), 3, null);
            this.bottomSheetJob = launch$default;
        } else {
            b(warning);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f fVar, SNSPreviewPhotoDocumentViewModel.k kVar, View view) {
        fVar.x();
        if (kVar.l()) {
            ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).N();
        } else {
            ((SNSPreviewPhotoDocumentViewModel) fVar.getViewModel()).O();
        }
    }
}
