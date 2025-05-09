package s7;

import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.crypto.verify.VerifyAddressFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import t6.x6;
import w5.C1572a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: s7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1237a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyAddressFragment f27047b;

    public /* synthetic */ C1237a(VerifyAddressFragment verifyAddressFragment, int i) {
        this.f27046a = i;
        this.f27047b = verifyAddressFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        ArrayList<String> arrayList;
        String str2;
        String str3;
        ArrayList<String> arrayList2;
        switch (this.f27046a) {
            case 0:
                this.f27047b.getClass();
                break;
            case 1:
                U4.b.g(this.f27047b).l();
                break;
            case 2:
                List list = (List) obj;
                VerifyAddressFragment verifyAddressFragment = this.f27047b;
                verifyAddressFragment.f12164q0.clear();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (((C1572a) obj2).f30827b != null) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it = arrayList3.iterator();
                while (true) {
                    String str4 = "";
                    if (!it.hasNext()) {
                        verifyAddressFragment.f12163p0 = (C1572a) s.L(list);
                        x6 u02 = verifyAddressFragment.u0();
                        C1572a c1572a = verifyAddressFragment.f12163p0;
                        if (c1572a == null || (str = c1572a.f30827b) == null) {
                            str = "";
                        }
                        u02.f29799r.setText(str);
                        x6 u03 = verifyAddressFragment.u0();
                        C1572a c1572a2 = verifyAddressFragment.f12163p0;
                        if (c1572a2 != null && (arrayList = c1572a2.f30829d) != null && (str2 = (String) s.J(arrayList)) != null) {
                            str4 = str2;
                        }
                        u03.f29800s.setText(str4);
                        break;
                    } else {
                        C1572a c1572a3 = (C1572a) it.next();
                        ArrayList arrayList4 = verifyAddressFragment.f12164q0;
                        String str5 = c1572a3.f30827b;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = c1572a3.f30830e;
                        arrayList4.add(new StatementsSelectorDialog.a(str6, str7 == null ? "" : str7, str5 == null ? "" : str5, "", "", null, null, null, false, 480));
                    }
                }
                break;
            case 3:
                this.f27047b.u0().f29800s.setText((String) obj);
                break;
            default:
                String str8 = (String) obj;
                VerifyAddressFragment verifyAddressFragment2 = this.f27047b;
                verifyAddressFragment2.u0().f29799r.setText(str8);
                List<C1572a> value = verifyAddressFragment2.T0().f27055W0.getValue();
                C1572a c1572a4 = null;
                if (value != null) {
                    Iterator<T> it2 = value.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (f.b(((C1572a) next).f30827b, str8)) {
                                c1572a4 = next;
                            }
                        }
                    }
                    c1572a4 = c1572a4;
                }
                verifyAddressFragment2.f12163p0 = c1572a4;
                x6 u04 = verifyAddressFragment2.u0();
                C1572a c1572a5 = verifyAddressFragment2.f12163p0;
                if (c1572a5 == null || (arrayList2 = c1572a5.f30829d) == null || (str3 = (String) s.L(arrayList2)) == null) {
                    str3 = "";
                }
                u04.f29800s.setText(str3);
                break;
        }
        return p.f3034a;
    }
}
