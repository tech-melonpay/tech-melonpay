package m;

import A0.a;
import B0.d;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.luminary.mobile.R;
import m.C1021x;
import y0.C1596C;
import y0.C1599c;

/* compiled from: AppCompatEditText.java */
/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1009k extends EditText implements y0.r {
    private final C1010l mAppCompatEmojiEditTextHelper;
    private final C1002d mBackgroundTintHelper;
    private final B0.e mDefaultOnReceiveContentListener;
    private a mSuperCaller;
    private final C1021x mTextClassifierHelper;
    private final C1022y mTextHelper;

    /* compiled from: AppCompatEditText.java */
    /* renamed from: m.k$a */
    public class a {
        public a() {
        }
    }

    public C1009k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.a();
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof d.c ? ((d.c) customSelectionActionModeCallback).f215a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1021x c1021x;
        if (Build.VERSION.SDK_INT >= 28 || (c1021x = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c1021x.f23812b;
        return textClassifier == null ? C1021x.a.a(c1021x.f23811a) : textClassifier;
    }

    public void initEmojiKeyListener(C1010l c1010l) {
        KeyListener keyListener = getKeyListener();
        c1010l.getClass();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = c1010l.a(keyListener);
            if (a10 == keyListener) {
                return;
            }
            super.setKeyListener(a10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g10;
        int i;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i9 >= 30) {
                a.C0000a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i9 >= 30) {
                    a.C0000a.a(editorInfo, text);
                } else {
                    int i10 = editorInfo.initialSelStart;
                    int i11 = editorInfo.initialSelEnd;
                    int i12 = i10 > i11 ? i11 : i10;
                    if (i10 <= i11) {
                        i10 = i11;
                    }
                    int length = text.length();
                    if (i12 < 0 || i10 > length) {
                        A0.a.a(editorInfo, null, 0, 0);
                    } else {
                        int i13 = editorInfo.inputType & 4095;
                        if (i13 == 129 || i13 == 225 || i13 == 18) {
                            A0.a.a(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            A0.a.a(editorInfo, text, i12, i10);
                        } else {
                            int i14 = i10 - i12;
                            int i15 = i14 > 1024 ? 0 : i14;
                            int i16 = 2048 - i15;
                            int min = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (i16 * 0.8d)));
                            int min2 = Math.min(i12, i16 - min);
                            int i17 = i12 - min2;
                            if (Character.isLowSurrogate(text.charAt(i17))) {
                                i = 1;
                                i17++;
                                min2--;
                            } else {
                                i = 1;
                            }
                            if (Character.isHighSurrogate(text.charAt((i10 + min) - i))) {
                                min -= i;
                            }
                            int i18 = min2 + i15;
                            A0.a.a(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i10, min + i10)) : text.subSequence(i17, i18 + min + i17), min2, i18);
                        }
                    }
                }
            }
        }
        j3.e.x(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i9 <= 30 && (g10 = C1596C.g(this)) != null) {
            editorInfo.contentMimeTypes = g10;
            onCreateInputConnection = new A0.c(onCreateInputConnection, new A0.b(this, 0));
        }
        return this.mAppCompatEmojiEditTextHelper.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C1596C.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && C1018u.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // y0.r
    public C1599c onReceiveContent(C1599c c1599c) {
        return this.mDefaultOnReceiveContentListener.a(this, c1599c);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        C1599c.b bVar;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31 || C1596C.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i9 >= 31) {
                bVar = new C1599c.a(primaryClip, 1);
            } else {
                C1599c.C0482c c0482c = new C1599c.C0482c();
                c0482c.f31052a = primaryClip;
                c0482c.f31053b = 1;
                bVar = c0482c;
            }
            bVar.b(i == 16908322 ? 0 : 1);
            C1596C.k(this, bVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(B0.d.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.mAppCompatEmojiEditTextHelper.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1021x c1021x;
        if (Build.VERSION.SDK_INT >= 28 || (c1021x = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1021x.f23812b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W.a(context);
        U.a(this, getContext());
        C1002d c1002d = new C1002d(this);
        this.mBackgroundTintHelper = c1002d;
        c1002d.d(attributeSet, i);
        C1022y c1022y = new C1022y(this);
        this.mTextHelper = c1022y;
        c1022y.f(attributeSet, i);
        c1022y.b();
        C1021x c1021x = new C1021x();
        c1021x.f23811a = this;
        this.mTextClassifierHelper = c1021x;
        this.mDefaultOnReceiveContentListener = new B0.e();
        C1010l c1010l = new C1010l(this);
        this.mAppCompatEmojiEditTextHelper = c1010l;
        c1010l.b(attributeSet, i);
        initEmojiKeyListener(c1010l);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
