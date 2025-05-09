package com.sumsub.sns.core.widget.applicantData;

import C.v;
import O9.p;
import P9.m;
import P9.s;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSAddFileItemView;
import com.sumsub.sns.core.widget.SNSFileItemView;
import com.sumsub.sns.core.widget.SNSProgressBarView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002JKB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0010R*\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R6\u0010=\u001a\b\u0012\u0004\u0012\u0002060\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002060\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010\u0010R\u0016\u0010C\u001a\u0004\u0018\u00010@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR(\u0010F\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010\u001aR(\u0010I\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u0010\u001a¨\u0006L"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;", FirebaseAnalytics.Param.ITEMS, "LO9/p;", "populateViewItems", "(Ljava/util/List;)V", "cleanup", "()V", "", "value", "pickFileLabel", "Ljava/lang/CharSequence;", "getPickFileLabel", "()Ljava/lang/CharSequence;", "setPickFileLabel", "(Ljava/lang/CharSequence;)V", "files", "Ljava/util/List;", "getFiles", "()Ljava/util/List;", "setFiles", "", "showPickFile", "Z", "getShowPickFile", "()Z", "setShowPickFile", "(Z)V", "Lkotlin/Function0;", "pickFileClickListener", "Lca/a;", "getPickFileClickListener", "()Lca/a;", "setPickFileClickListener", "(Lca/a;)V", "Lkotlin/Function1;", "", "deleteFileClickListener", "Lca/l;", "getDeleteFileClickListener", "()Lca/l;", "setDeleteFileClickListener", "(Lca/l;)V", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;", "state", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;", "getState", "()Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;", "setState", "(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;)V", "itemStates", "getItemStates", "setItemStates", "Landroid/view/ViewGroup;", "getFilesView", "()Landroid/view/ViewGroup;", "filesView", "getError", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getLabel", "setLabel", "label", "Attachment", "State", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataFileFieldView extends SNSApplicantDataBaseFieldView {
    private InterfaceC0646l<? super String, p> deleteFileClickListener;
    private List<Attachment> files;
    private List<? extends State> itemStates;
    private InterfaceC0635a<p> pickFileClickListener;
    private CharSequence pickFileLabel;
    private boolean showPickFile;
    private State state;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;", "", "", "id", "label", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getImageUrl", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Attachment {
        private final String id;
        private final String imageUrl;
        private final String label;

        public Attachment(String str, String str2, String str3) {
            this.id = str;
            this.label = str2;
            this.imageUrl = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return f.b(this.id, attachment.id) && f.b(this.label, attachment.label) && f.b(this.imageUrl, attachment.imageUrl);
        }

        public final String getId() {
            return this.id;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.label;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageUrl;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Attachment(id=");
            sb2.append(this.id);
            sb2.append(", label=");
            sb2.append(this.label);
            sb2.append(", imageUrl=");
            return v.q(sb2, this.imageUrl, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        DEFAULT,
        LOADING
    }

    public /* synthetic */ SNSApplicantDataFileFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataFileFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataFileFieldView : i9);
    }

    private final ViewGroup getFilesView() {
        return (ViewGroup) findViewById(R$id.sns_data_file);
    }

    private final void populateViewItems(List<Attachment> items) {
        ViewGroup filesView = getFilesView();
        if (filesView == null) {
            return;
        }
        cleanup();
        filesView.removeAllViews();
        Context context = filesView.getContext();
        if (context == null) {
            return;
        }
        int i = 0;
        for (Object obj : items) {
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            Attachment attachment = (Attachment) obj;
            SNSFileItemView sNSFileItemView = new SNSFileItemView(context, null, 0, 0, 14, null);
            sNSFileItemView.setText(attachment.getLabel());
            sNSFileItemView.loadImage(attachment.getImageUrl());
            sNSFileItemView.setStartIcon(e0.f15081a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.IMAGE.getImageName()));
            if (((State) s.M(i, this.itemStates)) == State.LOADING) {
                sNSFileItemView.setProgressVisibility(true);
            } else {
                com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
                Drawable a10 = aVar.a(context, SNSIconHandler.SNSCommonIcons.DELETE.getImageName());
                if (a10 == null) {
                    a10 = aVar.a(context, SNSIconHandler.SNSCommonIcons.BIN.getImageName());
                }
                sNSFileItemView.setEndIcon(a10);
                sNSFileItemView.setEndIconClickListener(new B7.f(16, this, attachment));
            }
            filesView.addView(sNSFileItemView);
            i = i9;
        }
        if (this.showPickFile && this.state == State.DEFAULT) {
            SNSAddFileItemView sNSAddFileItemView = new SNSAddFileItemView(context, null, 0, 0, 14, null);
            sNSAddFileItemView.setText(this.pickFileLabel);
            sNSAddFileItemView.loadImage(null);
            sNSAddFileItemView.setStartIcon(e0.f15081a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.ATTACHMENT.getImageName()));
            sNSAddFileItemView.setOnClickListener(new J7.b(this, 14));
            filesView.addView(sNSAddFileItemView);
        }
        if (this.state == State.LOADING) {
            SNSProgressBarView sNSProgressBarView = new SNSProgressBarView(context, null, R.attr.progressBarStyle);
            sNSProgressBarView.setLayoutParams(new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_medium)));
            filesView.addView(sNSProgressBarView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: populateViewItems$lambda-7$lambda-6$lambda-5, reason: not valid java name */
    public static final void m60populateViewItems$lambda7$lambda6$lambda5(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, Attachment attachment, View view) {
        InterfaceC0646l<? super String, p> interfaceC0646l = sNSApplicantDataFileFieldView.deleteFileClickListener;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(attachment.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: populateViewItems$lambda-9$lambda-8, reason: not valid java name */
    public static final void m61populateViewItems$lambda9$lambda8(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, View view) {
        InterfaceC0635a<p> interfaceC0635a = sNSApplicantDataFileFieldView.pickFileClickListener;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    public final void cleanup() {
        ViewGroup filesView = getFilesView();
        if (filesView != null) {
            P9.v vVar = new P9.v(filesView, 4);
            while (vVar.hasNext()) {
                View view = (View) vVar.next();
                if (view instanceof SNSFileItemView) {
                    ((SNSFileItemView) view).loadImage(null);
                }
            }
        }
    }

    public final InterfaceC0646l<String, p> getDeleteFileClickListener() {
        return this.deleteFileClickListener;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    public final List<Attachment> getFiles() {
        return this.files;
    }

    public final List<State> getItemStates() {
        return this.itemStates;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        return (tvLabel$idensic_mobile_sdk_aar_release == null || (text = tvLabel$idensic_mobile_sdk_aar_release.getText()) == null) ? "" : text;
    }

    public final InterfaceC0635a<p> getPickFileClickListener() {
        return this.pickFileClickListener;
    }

    public final CharSequence getPickFileLabel() {
        return this.pickFileLabel;
    }

    public final boolean getShowPickFile() {
        return this.showPickFile;
    }

    public final State getState() {
        return this.state;
    }

    public final void setDeleteFileClickListener(InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.deleteFileClickListener = interfaceC0646l;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            i.a(tvError, charSequence);
        }
        ViewGroup filesView = getFilesView();
        if (filesView != null) {
            int childCount = filesView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                SNSStepViewExtensionsKt.setSnsStepState(filesView.getChildAt(i), (charSequence == null || charSequence.length() == 0) ? SNSStepState.INIT : SNSStepState.REJECTED);
            }
        }
    }

    public final void setFiles(List<Attachment> list) {
        setError(null);
        populateViewItems(list);
        this.files = list;
    }

    public final void setItemStates(List<? extends State> list) {
        this.itemStates = list;
        populateViewItems(this.files);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            i.a(tvLabel$idensic_mobile_sdk_aar_release, charSequence);
        }
    }

    public final void setPickFileClickListener(InterfaceC0635a<p> interfaceC0635a) {
        this.pickFileClickListener = interfaceC0635a;
    }

    public final void setPickFileLabel(CharSequence charSequence) {
        Object obj;
        this.pickFileLabel = charSequence;
        ViewGroup filesView = getFilesView();
        if (filesView != null) {
            P9.v vVar = new P9.v(filesView, 4);
            while (true) {
                if (!vVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = vVar.next();
                    if (((View) obj) instanceof SNSAddFileItemView) {
                        break;
                    }
                }
            }
            View view = (View) obj;
            if (view != null) {
                ((SNSAddFileItemView) view).setText(charSequence);
            }
        }
    }

    public final void setShowPickFile(boolean z10) {
        this.showPickFile = z10;
        populateViewItems(this.files);
    }

    public final void setState(State state) {
        this.state = state;
    }

    public SNSApplicantDataFileFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        this.pickFileLabel = "";
        EmptyList emptyList = EmptyList.f23104a;
        this.files = emptyList;
        this.showPickFile = true;
        this.state = State.DEFAULT;
        this.itemStates = emptyList;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataFileFieldView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataFileFieldView_sns_applicantDataFileFieldLayout, R$layout.sns_layout_applicant_data_file_field_view), (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        populateViewItems(emptyList);
        onInitializationFinished();
    }
}
