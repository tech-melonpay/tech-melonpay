package com.sumsub.sns.core.widget.pincode;

import O9.p;
import T2.f;
import T2.i;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.measurement.internal.a;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.theme.d;
import ha.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 u2\u00020\u0001:\u0004vuwxB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\rH\u0014¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010.J\u000f\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00100J\u0017\u00107\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b7\u0010(J\u000f\u00108\u001a\u00020\u001bH\u0002¢\u0006\u0004\b8\u00103J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u00100J\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u00100J\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u00100J\u0017\u0010=\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001bH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\rH\u0002¢\u0006\u0004\b?\u00100R\u001c\u0010A\u001a\b\u0018\u00010@R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010H\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010D\u001a\u0004\bV\u00103\"\u0004\bW\u0010>R$\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010J\u001a\u0004\ba\u0010b\"\u0004\bc\u0010.R*\u0010e\u001a\u00020\u001b2\u0006\u0010d\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010D\u001a\u0004\be\u00103\"\u0004\bf\u0010>R(\u0010l\u001a\u0004\u0018\u00010g2\b\u0010d\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR(\u0010o\u001a\u0004\u0018\u00010g2\b\u0010d\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010i\"\u0004\bn\u0010kR(\u0010t\u001a\u0004\u0018\u00010\u000b2\b\u0010d\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010s¨\u0006y"}, d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "Landroid/widget/EditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "radius", "LO9/p;", "setCornerSize", "(F)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", TextBundle.TEXT_ENTRY, "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "selStart", "selEnd", "onSelectionChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/text/method/MovementMethod;", "getDefaultMovementMethod", "()Landroid/text/method/MovementMethod;", "screenState", "onScreenStateChanged", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "isSuggestionsEnabled", "()Z", "maxLength", "setMaxLength", "moveSelectionToEnd", "drawPinView", "shouldBlink", "makeBlink", "suspendBlink", "resumeBlink", "showCursor", "invalidateCursor", "(Z)V", "disableSelectionMenu", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;", "mBlink", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;", "isCursorVisible", "Z", "drawCursor", "Landroid/graphics/drawable/Drawable;", "cursorDrawable", "Landroid/graphics/drawable/Drawable;", "itemSpacing", "I", "itemPadding", "rect", "Landroid/graphics/Rect;", "LT2/i;", "shapeAppearance", "LT2/i;", "itemBackground", "getItemBackground", "()Landroid/graphics/drawable/Drawable;", "setItemBackground", "(Landroid/graphics/drawable/Drawable;)V", "isPassword", "setPassword", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "onTextCompleteListener", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "getOnTextCompleteListener", "()Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "setOnTextCompleteListener", "(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V", "count", "itemCount", "getItemCount", "()I", "setItemCount", "value", "isError", "setError", "Landroid/content/res/ColorStateList;", "getBoxBackgroundColor", "()Landroid/content/res/ColorStateList;", "setBoxBackgroundColor", "(Landroid/content/res/ColorStateList;)V", "boxBackgroundColor", "getBoxStrokeColor", "setBoxStrokeColor", "boxStrokeColor", "getBoxStrokeWidth", "()Ljava/lang/Float;", "setBoxStrokeWidth", "(Ljava/lang/Float;)V", "boxStrokeWidth", "Companion", "Blink", "DefaultActionModeCallback", "OnTextCompleteListener", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public final class SNSPinView extends EditText {
    private Drawable cursorDrawable;
    private boolean drawCursor;
    private boolean isCursorVisible;
    private boolean isError;
    private boolean isPassword;
    private Drawable itemBackground;
    private int itemCount;
    private int itemPadding;
    private int itemSpacing;
    private Blink mBlink;
    private OnTextCompleteListener onTextCompleteListener;
    private final Rect rect;
    private final i shapeAppearance;
    private static final InputFilter[] NO_FILTERS = new InputFilter[0];
    private static final int[] HIGHLIGHT_STATE = {R.attr.state_selected};
    private static final int[] ERROR_STATE = {R$attr.sns_stateRejected};

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;", "Ljava/lang/Runnable;", "<init>", "(Lcom/sumsub/sns/core/widget/pincode/SNSPinView;)V", "LO9/p;", "run", "()V", "cancel", "uncancel", "", "mCancelled", "Z", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public final class Blink implements Runnable {
        private boolean mCancelled;

        public Blink() {
        }

        public final void cancel() {
            if (this.mCancelled) {
                return;
            }
            SNSPinView.this.removeCallbacks(this);
            this.mCancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mCancelled) {
                return;
            }
            SNSPinView.this.removeCallbacks(this);
            if (SNSPinView.this.shouldBlink()) {
                SNSPinView.this.invalidateCursor(!r0.drawCursor);
                SNSPinView.this.postDelayed(this, 500L);
            }
        }

        public final void uncancel() {
            this.mCancelled = false;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "", "onTextComplete", "", "enteredText", "", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnTextCompleteListener {
        boolean onTextComplete(String enteredText);
    }

    public SNSPinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void disableSelectionMenu() {
        setCustomSelectionActionModeCallback(new DefaultActionModeCallback());
        setCustomInsertionActionModeCallback(new DefaultActionModeCallback() { // from class: com.sumsub.sns.core.widget.pincode.SNSPinView$disableSelectionMenu$1
            @Override // com.sumsub.sns.core.widget.pincode.SNSPinView.DefaultActionModeCallback, android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                menu.removeItem(R.id.autofill);
                return true;
            }
        });
    }

    private final void drawPinView(Canvas canvas) {
        boolean z10;
        boolean z11;
        Drawable drawable;
        Editable text = getText();
        boolean z12 = false;
        int length = text != null ? text.length() : 0;
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (height < 0) {
            height = 0;
        }
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i = this.itemCount;
        int S = h.S((width - ((i - 1) * this.itemSpacing)) / i, 0, height);
        int paddingStart = getPaddingStart();
        int width2 = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i9 = this.itemCount;
        boolean z13 = true;
        int i10 = (width2 - (S * i9)) - ((i9 - 1) * this.itemSpacing);
        int i11 = 2;
        int i12 = (i10 / 2) + paddingStart;
        int height2 = ((((getHeight() - height) - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int i13 = this.itemCount;
        int i14 = 0;
        while (i14 < i13) {
            boolean z14 = (isFocused() && length == i14) ? z13 : z12;
            int i15 = ((this.itemSpacing + S) * i14) + i12;
            int i16 = i15 + S;
            Drawable drawable2 = this.itemBackground;
            if (drawable2 != null) {
                drawable2.setState(this.isError ? ERROR_STATE : z14 ? HIGHLIGHT_STATE : getDrawableState());
                drawable2.setBounds(i15, height2, i16, height2 + height);
                canvas.save();
                drawable2.draw(canvas);
                canvas.restore();
            }
            if (z14 && this.drawCursor && (drawable = this.cursorDrawable) != null) {
                int intrinsicWidth = (((i16 - i15) - drawable.getIntrinsicWidth()) / i11) + i15;
                int t3 = a.t(height, (int) getTextSize(), i11, height2);
                drawable.setBounds(intrinsicWidth, t3, drawable.getIntrinsicWidth() + intrinsicWidth, ((int) getTextSize()) + t3);
                canvas.save();
                drawable.draw(canvas);
                canvas.restore();
            }
            Editable text2 = getText();
            if (i14 < (text2 != null ? text2.length() : 0)) {
                if (this.isPassword) {
                    float f10 = i16 - i15;
                    getPaint().setColor(getCurrentTextColor());
                    canvas.drawCircle((f10 / 2.0f) + i15, (height2 + height) - (height / 2.0f), f10 / 9.0f, getPaint());
                } else {
                    String obj = getText().subSequence(i14, i14 + 1).toString();
                    z10 = true;
                    z11 = false;
                    getPaint().getTextBounds(obj, 0, 1, this.rect);
                    getPaint().setColor(getCurrentTextColor());
                    canvas.drawText(obj, (((i16 - i15) - this.rect.width()) / 2.0f) + i15, (height2 + height) - ((height - this.rect.height()) / 2.0f), getPaint());
                    i14++;
                    z13 = z10;
                    z12 = z11;
                    i11 = 2;
                }
            }
            z10 = true;
            z11 = false;
            i14++;
            z13 = z10;
            z12 = z11;
            i11 = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateCursor(boolean showCursor) {
        if (this.drawCursor != showCursor) {
            this.drawCursor = showCursor;
            invalidate();
        }
    }

    private final void makeBlink() {
        if (!shouldBlink()) {
            Blink blink = this.mBlink;
            if (blink != null) {
                removeCallbacks(blink);
                return;
            }
            return;
        }
        if (this.mBlink == null) {
            this.mBlink = new Blink();
        }
        removeCallbacks(this.mBlink);
        this.drawCursor = false;
        postDelayed(this.mBlink, 500L);
    }

    private final void moveSelectionToEnd() {
        Editable text = getText();
        setSelection(text != null ? text.length() : 0);
    }

    private final void resumeBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.uncancel();
            makeBlink();
        }
    }

    private final void setMaxLength(int maxLength) {
        setFilters(maxLength >= 0 ? new InputFilter[]{new InputFilter.LengthFilter(maxLength)} : NO_FILTERS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldBlink() {
        return isCursorVisible() && isFocused();
    }

    private final void suspendBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.cancel();
            invalidateCursor(false);
        }
    }

    public final ColorStateList getBoxBackgroundColor() {
        Drawable drawable = this.itemBackground;
        f fVar = drawable instanceof f ? (f) drawable : null;
        if (fVar != null) {
            return fVar.f3448a.f3473c;
        }
        return null;
    }

    public final ColorStateList getBoxStrokeColor() {
        Drawable drawable = this.itemBackground;
        f fVar = drawable instanceof f ? (f) drawable : null;
        if (fVar != null) {
            return fVar.f3448a.f3474d;
        }
        return null;
    }

    public final Float getBoxStrokeWidth() {
        Drawable drawable = this.itemBackground;
        f fVar = drawable instanceof f ? (f) drawable : null;
        if (fVar != null) {
            return Float.valueOf(fVar.f3448a.f3480k);
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        return DefaultMovementMethod.INSTANCE;
    }

    public final Drawable getItemBackground() {
        return this.itemBackground;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    public final OnTextCompleteListener getOnTextCompleteListener() {
        return this.onTextCompleteListener;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeBlink();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        suspendBlink();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        drawPinView(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused) {
            moveSelectionToEnd();
            makeBlink();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getPaint().getTextBounds("8", 0, 1, this.rect);
        int height = this.rect.height() + this.itemPadding;
        int i = this.itemPadding;
        int width = this.rect.width() + i + this.itemPadding;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + height + i;
        int paddingStart = getPaddingStart();
        int i9 = this.itemCount;
        setMeasuredDimension(View.resolveSizeAndState(((i9 - 1) * this.itemSpacing) + (width * i9) + paddingStart, widthMeasureSpec, 0), View.resolveSizeAndState(paddingBottom, heightMeasureSpec, 0));
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int screenState) {
        super.onScreenStateChanged(screenState);
        if (screenState == 0) {
            suspendBlink();
        } else {
            if (screenState != 1) {
                return;
            }
            resumeBlink();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        Editable text = getText();
        if (text == null || selEnd != text.length()) {
            moveSelectionToEnd();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        OnTextCompleteListener onTextCompleteListener;
        if (start != text.length()) {
            moveSelectionToEnd();
        }
        makeBlink();
        if (text.length() == this.itemCount && (onTextCompleteListener = this.onTextCompleteListener) != null && onTextCompleteListener.onTextComplete(text.toString())) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public final void setBoxBackgroundColor(ColorStateList colorStateList) {
        Drawable drawable = this.itemBackground;
        f fVar = drawable instanceof f ? (f) drawable : null;
        if (fVar == null) {
            return;
        }
        fVar.o(colorStateList);
    }

    public final void setBoxStrokeColor(ColorStateList colorStateList) {
        Drawable drawable = this.itemBackground;
        f fVar = drawable instanceof f ? (f) drawable : null;
        if (fVar == null) {
            return;
        }
        fVar.r(colorStateList);
    }

    public final void setBoxStrokeWidth(Float f10) {
        if (f10 != null) {
            float floatValue = f10.floatValue();
            Drawable drawable = this.itemBackground;
            f fVar = drawable instanceof f ? (f) drawable : null;
            if (fVar == null) {
                return;
            }
            fVar.s(floatValue);
        }
    }

    public final void setCornerSize(float radius) {
        Drawable drawable = this.itemBackground;
        f fVar = drawable instanceof f ? (f) drawable : null;
        if (fVar != null) {
            fVar.m(radius);
        }
    }

    public final void setError(boolean z10) {
        this.isError = z10;
        invalidate();
    }

    public final void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
    }

    public final void setItemCount(int i) {
        this.itemCount = i;
        setMaxLength(i);
        requestLayout();
    }

    public final void setOnTextCompleteListener(OnTextCompleteListener onTextCompleteListener) {
        this.onTextCompleteListener = onTextCompleteListener;
    }

    public final void setPassword(boolean z10) {
        this.isPassword = z10;
    }

    public /* synthetic */ SNSPinView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_pinViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSPinView : i9);
    }

    public SNSPinView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        Float a10;
        Float a11;
        Integer a12;
        Integer a13;
        this.rect = new Rect();
        i a14 = i.b(context, attributeSet, i, i9).a();
        this.shapeAppearance = a14;
        this.itemBackground = new f(a14);
        this.itemCount = 6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSPinView, i, i9);
        int i10 = R$styleable.SNSPinView_android_itemBackground;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.itemBackground = obtainStyledAttributes.getDrawable(i10);
        } else {
            int i11 = R$styleable.SNSPinView_boxBackgroundColor;
            if (obtainStyledAttributes.hasValue(i11)) {
                Drawable drawable = this.itemBackground;
                f fVar = drawable instanceof f ? (f) drawable : null;
                if (fVar != null) {
                    fVar.o(obtainStyledAttributes.getColorStateList(i11));
                }
            }
            int i12 = R$styleable.SNSPinView_boxStrokeColor;
            if (obtainStyledAttributes.hasValue(i12)) {
                Drawable drawable2 = this.itemBackground;
                f fVar2 = drawable2 instanceof f ? (f) drawable2 : null;
                if (fVar2 != null) {
                    fVar2.r(obtainStyledAttributes.getColorStateList(i12));
                }
            }
            int i13 = R$styleable.SNSPinView_boxStrokeWidth;
            if (obtainStyledAttributes.hasValue(i13)) {
                Drawable drawable3 = this.itemBackground;
                f fVar3 = drawable3 instanceof f ? (f) drawable3 : null;
                if (fVar3 != null) {
                    fVar3.s(obtainStyledAttributes.getDimension(i13, 0.0f));
                }
            }
        }
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSPinView_sns_itemSpacing, getResources().getDimensionPixelSize(R$dimen.sns_pin_view_item_spacing));
        this.itemPadding = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSPinView_sns_itemPadding, getResources().getDimensionPixelSize(R$dimen.sns_pin_view_item_padding));
        this.isCursorVisible = obtainStyledAttributes.getBoolean(R$styleable.SNSPinView_android_cursorVisible, true);
        this.cursorDrawable = obtainStyledAttributes.getDrawable(R$styleable.SNSPinView_sns_cursorDrawable);
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        setTransformationMethod(null);
        disableSelectionMenu();
        setMaxLength(6);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        aVar.a(this, SNSTypographyElement.HEADLINE1, SNSColorElement.FIELD_CONTENT);
        SNSColorElement sNSColorElement = SNSColorElement.FIELD_BACKGROUND;
        d a15 = aVar.a();
        if (a15 != null && (a13 = aVar.a(a15, sNSColorElement, aVar.a(this))) != null) {
            setBoxBackgroundColor(ColorStateList.valueOf(a13.intValue()));
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.FIELD_BORDER;
        d a16 = aVar.a();
        if (a16 != null && (a12 = aVar.a(a16, sNSColorElement2, aVar.a(this))) != null) {
            setBoxStrokeColor(ColorStateList.valueOf(a12.intValue()));
        }
        SNSMetricElement sNSMetricElement = SNSMetricElement.FIELD_CORNER_RADIUS;
        d a17 = aVar.a();
        if (a17 != null && (a11 = aVar.a(a17, sNSMetricElement)) != null) {
            setCornerSize(a11.floatValue());
        }
        SNSMetricElement sNSMetricElement2 = SNSMetricElement.FIELD_BORDER_WIDTH;
        d a18 = aVar.a();
        if (a18 == null || (a10 = aVar.a(a18, sNSMetricElement2)) == null) {
            return;
        }
        setBoxStrokeWidth(Float.valueOf(a10.floatValue()));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView$DefaultActionModeCallback;", "Landroid/view/ActionMode$Callback;", "<init>", "()V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "LO9/p;", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static class DefaultActionModeCallback implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
        }
    }
}
