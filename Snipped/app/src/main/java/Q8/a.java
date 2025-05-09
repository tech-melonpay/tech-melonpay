package Q8;

import android.widget.ImageView;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseDotsIndicator f3203b;

    public /* synthetic */ a(BaseDotsIndicator baseDotsIndicator, int i) {
        this.f3202a = i;
        this.f3203b = baseDotsIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3202a) {
            case 0:
                this.f3203b.d();
                break;
            case 1:
                BaseDotsIndicator baseDotsIndicator = this.f3203b;
                ArrayList<ImageView> arrayList = baseDotsIndicator.f20345a;
                int i = 0;
                if (arrayList.size() < baseDotsIndicator.f20351g.getCount()) {
                    int count = baseDotsIndicator.f20351g.getCount() - arrayList.size();
                    while (i < count) {
                        baseDotsIndicator.a(i);
                        i++;
                    }
                } else if (arrayList.size() > baseDotsIndicator.f20351g.getCount()) {
                    int size = arrayList.size() - baseDotsIndicator.f20351g.getCount();
                    while (i < size) {
                        baseDotsIndicator.f();
                        i++;
                    }
                }
                baseDotsIndicator.e();
                Iterator<ImageView> it = arrayList.iterator();
                while (it.hasNext()) {
                    ImageView next = it.next();
                    next.getLayoutParams().width = (int) baseDotsIndicator.f20348d;
                    next.requestLayout();
                }
                if (baseDotsIndicator.f20351g.e()) {
                    baseDotsIndicator.f20351g.d();
                    com.tbuonomo.viewpagerdotsindicator.a b9 = baseDotsIndicator.b();
                    baseDotsIndicator.f20351g.a(b9);
                    b9.b(baseDotsIndicator.f20351g.b(), 0.0f);
                    break;
                }
                break;
            case 2:
                this.f3203b.d();
                break;
            default:
                this.f3203b.d();
                break;
        }
    }
}
