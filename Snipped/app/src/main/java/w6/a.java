package W6;

import androidx.fragment.app.Fragment;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: CardDetailPagerAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends q1.a {

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<CardsDomain> f3828m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f3829n;

    public a(CardDetailsFragment cardDetailsFragment, ArrayList arrayList) {
        super(cardDetailsFragment);
        this.f3828m = arrayList;
        this.f3829n = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3828m.size();
    }

    public final Fragment j(int i) {
        return (Fragment) this.f3829n.get(Integer.valueOf(i));
    }
}
