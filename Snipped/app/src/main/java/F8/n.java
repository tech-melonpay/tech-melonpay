package F8;

import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.luminary.mobile.R;
import kotlin.Pair;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class n extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f1278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair<String, View.OnClickListener> f1279b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(TextView textView, Pair<String, ? extends View.OnClickListener> pair) {
        this.f1278a = textView;
        this.f1279b = pair;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Selection.setSelection((Spannable) ((TextView) view).getText(), 0);
        view.invalidate();
        this.f1279b.f23090b.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(o.a(R.color.black, this.f1278a));
        textPaint.setUnderlineText(true);
    }
}
