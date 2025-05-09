package com.sumsub.sns.core.widget;

import T2.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.l;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b*\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010B\u001a\u0004\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSFileItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/sumsub/sns/internal/core/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", TextBundle.TEXT_ENTRY, "LO9/p;", "setText", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "setStartIcon", "(Landroid/graphics/drawable/Drawable;)V", "", ImagesContract.URL, "loadImage", "(Ljava/lang/String;)V", "setEndIcon", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setEndIconClickListener", "(Landroid/view/View$OnClickListener;)V", "", "visible", "setProgressVisibility", "(Z)V", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "state", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/widget/SNSStepState;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Landroid/widget/ImageView;", "ivStartIcon", "Landroid/widget/ImageView;", "ivEndIcon", "Landroid/widget/TextView;", "tvText", "Landroid/widget/TextView;", "Landroid/view/View;", "endProgressBar", "Landroid/view/View;", "ivPreview", "LT2/i;", "shapeAppearanceModel", "LT2/i;", "stepState", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "LT2/f;", "boxBackground", "LT2/f;", "getBoxBackground$idensic_mobile_sdk_aar_release", "()LT2/f;", "Lcom/squareup/picasso/Picasso;", "picasso", "Lcom/squareup/picasso/Picasso;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSFileItemView extends ConstraintLayout implements com.sumsub.sns.internal.core.widget.a {
    private final T2.f boxBackground;
    private final View endProgressBar;
    private final ImageView ivEndIcon;
    private final ImageView ivPreview;
    private final ImageView ivStartIcon;
    private final Picasso picasso;
    private final i shapeAppearanceModel;
    private SNSStepState stepState;
    private final TextView tvText;

    public /* synthetic */ SNSFileItemView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_fileItemViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSFileItemView : i9);
    }

    /* renamed from: getBoxBackground$idensic_mobile_sdk_aar_release, reason: from getter */
    public final T2.f getBoxBackground() {
        return this.boxBackground;
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    public final void loadImage(String url) {
        Picasso picasso;
        if (url == null) {
            ImageView imageView = this.ivPreview;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.ivStartIcon;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.ivPreview;
            if (imageView3 == null || (picasso = this.picasso) == null) {
                return;
            }
            picasso.a(imageView3);
            return;
        }
        ImageView imageView4 = this.ivPreview;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        ImageView imageView5 = this.ivStartIcon;
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.sns_icon_size_normal_large);
        Picasso picasso2 = this.picasso;
        if (picasso2 != null) {
            if (url.trim().length() == 0) {
                throw new IllegalArgumentException("Path must not be empty.");
            }
            l lVar = new l(picasso2, Uri.parse(url));
            lVar.f13490b.a(dimensionPixelSize, dimensionPixelSize);
            lVar.a(this.ivPreview);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepStateDrawable(this) : new int[]{R$attr.sns_stateInit});
    }

    public final void setEndIcon(Drawable icon) {
        ImageView imageView = this.ivEndIcon;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
            imageView.setVisibility(icon != null ? 0 : 8);
        }
    }

    public final void setEndIconClickListener(View.OnClickListener listener) {
        ImageView imageView = this.ivEndIcon;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setProgressVisibility(boolean visible) {
        View view = this.endProgressBar;
        if (view != null) {
            view.setVisibility(visible ? 0 : 8);
        }
        ImageView imageView = this.ivEndIcon;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(visible ^ true ? 0 : 8);
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public void setSNSStepState(SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            getBackground().setState(SNSStepViewExtensionsKt.getSnsStepStateDrawable(this));
            refreshDrawableState();
        }
    }

    public final void setStartIcon(Drawable icon) {
        ImageView imageView = this.ivStartIcon;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
        }
    }

    public final void setText(CharSequence text) {
        TextView textView = this.tvText;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public SNSFileItemView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        float dimensionPixelSize;
        Integer a10;
        i a11 = i.b(context, attributeSet, i, i9).a();
        this.shapeAppearanceModel = a11;
        T2.f fVar = new T2.f(a11);
        this.boxBackground = fVar;
        this.picasso = com.sumsub.sns.core.common.b.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFileItemView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSFileItemView_sns_fileItemViewLayout, R$layout.sns_layout_questionnaire_file), (ViewGroup) this, true);
        this.endProgressBar = findViewById(R$id.sns_progress_bar);
        ImageView imageView = (ImageView) findViewById(R$id.sns_end_icon);
        this.ivEndIcon = imageView;
        ImageView imageView2 = (ImageView) findViewById(R$id.sns_start_icon);
        this.ivStartIcon = imageView2;
        TextView textView = (TextView) findViewById(R$id.sns_text);
        this.tvText = textView;
        ImageView imageView3 = (ImageView) findViewById(R$id.sns_image);
        this.ivPreview = imageView3;
        int i10 = R$styleable.SNSFileItemView_sns_startIconTint;
        if (obtainStyledAttributes.hasValue(i10) && imageView2 != null) {
            imageView2.setImageTintList(com.sumsub.sns.internal.core.common.i.a(obtainStyledAttributes, context, i10));
        }
        int i11 = R$styleable.SNSFileItemView_sns_endIconTint;
        if (obtainStyledAttributes.hasValue(i11) && imageView != null) {
            imageView.setImageTintList(com.sumsub.sns.internal.core.common.i.a(obtainStyledAttributes, context, i11));
        }
        int i12 = R$styleable.SNSFileItemView_android_textColor;
        if (obtainStyledAttributes.hasValue(i12) && textView != null) {
            textView.setTextColor(com.sumsub.sns.internal.core.common.i.a(obtainStyledAttributes, context, i12));
        }
        int i13 = R$styleable.SNSFileItemView_boxBackgroundColor;
        if (obtainStyledAttributes.hasValue(i13)) {
            fVar.o(com.sumsub.sns.internal.core.common.i.a(obtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSFileItemView_boxStrokeColor;
        if (obtainStyledAttributes.hasValue(i14)) {
            fVar.r(com.sumsub.sns.internal.core.common.i.a(obtainStyledAttributes, context, i14));
        }
        int i15 = R$styleable.SNSFileItemView_boxStrokeWidth;
        if (obtainStyledAttributes.hasValue(i15)) {
            fVar.s(obtainStyledAttributes.getDimension(i15, 0.0f));
        }
        int i16 = R$styleable.SNSFileItemView_background;
        setBackground(obtainStyledAttributes.hasValue(i16) ? obtainStyledAttributes.getDrawable(i16) : fVar);
        int i17 = R$styleable.SNSFileItemView_previewCornerRadius;
        if (obtainStyledAttributes.hasValue(i17)) {
            ShapeableImageView shapeableImageView = imageView3 instanceof ShapeableImageView ? (ShapeableImageView) imageView3 : null;
            if (shapeableImageView != null) {
                i.a aVar = new i.a();
                aVar.c(obtainStyledAttributes.getDimension(i17, 0.0f));
                shapeableImageView.setShapeAppearanceModel(aVar.a());
            }
        }
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar2 = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a12 = aVar2.a();
        if (a12 != null) {
            Integer a13 = aVar2.a(this, SNSColorElement.FIELD_BACKGROUND);
            Integer a14 = aVar2.a(this, SNSColorElement.FIELD_BACKGROUND_INVALID);
            a14 = a14 == null ? aVar2.a(this, SNSColorElement.BACKGROUND_CRITICAL) : a14;
            Integer a15 = aVar2.a(this, SNSColorElement.CONTENT_WEAK);
            Float a16 = aVar2.a(a12, SNSMetricElement.FIELD_CORNER_RADIUS);
            if (a13 != null || a15 != null || a16 != null) {
                int[][] iArr = {new int[]{R$attr.sns_stateInit}, new int[]{R$attr.sns_stateRejected}, new int[0]};
                int a17 = com.sumsub.sns.internal.core.common.i.a(context, R.attr.colorBackground);
                int a18 = com.sumsub.sns.internal.core.common.i.a(context, R$attr.sns_colorRejected);
                GradientDrawable gradientDrawable = new GradientDrawable();
                setBackground(gradientDrawable);
                gradientDrawable.setColor(new ColorStateList(iArr, new int[]{a13 != null ? a13.intValue() : a17, a14 != null ? a14.intValue() : a18, a13 != null ? a13.intValue() : a17}));
                if (a16 != null) {
                    dimensionPixelSize = a16.floatValue();
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.sns_file_attachment_corner_radius);
                }
                gradientDrawable.setCornerRadius(dimensionPixelSize);
                if (a15 != null) {
                    int a19 = com.sumsub.sns.internal.core.common.i.a(1);
                    float a20 = com.sumsub.sns.internal.core.common.i.a(4);
                    gradientDrawable.setStroke(a19, ColorStateList.valueOf(a15.intValue()), a20, a20);
                }
            }
            if (a15 != null) {
                int intValue = a15.intValue();
                if (imageView2 != null) {
                    imageView2.setImageTintList(ColorStateList.valueOf(intValue));
                }
            }
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_LINK;
            com.sumsub.sns.internal.core.theme.d a21 = aVar2.a();
            if (a21 == null || (a10 = aVar2.a(a21, sNSColorElement, aVar2.a(this))) == null) {
                return;
            }
            int intValue2 = a10.intValue();
            if (textView != null) {
                textView.setTextColor(intValue2);
            }
        }
    }
}
