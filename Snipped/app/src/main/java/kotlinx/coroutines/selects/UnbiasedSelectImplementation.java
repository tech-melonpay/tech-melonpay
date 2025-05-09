package kotlinx.coroutines.selects;

import T9.a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.selects.SelectImplementation;

/* compiled from: SelectUnbiased.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000f\u001a\u00020\u0007*\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u000f\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u00122\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0014JX\u0010\u000f\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u0015\"\u0004\b\u0002\u0010\u0011*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u0012\u0012\u000e\u0012\f0\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectImplementation;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "Lkotlin/coroutines/d;", "context", "<init>", "(Lkotlin/coroutines/d;)V", "LO9/p;", "shuffleAndRegisterClauses", "()V", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "LT9/a;", "", "block", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lca/l;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lca/p;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lca/p;)V", "doSelect", "(LT9/a;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "clausesToRegister", "Ljava/util/List;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {
    private final List<SelectImplementation<R>.ClauseData> clausesToRegister;

    public UnbiasedSelectImplementation(d dVar) {
        super(dVar);
        this.clausesToRegister = new ArrayList();
    }

    public static /* synthetic */ <R> Object doSelect$suspendImpl(UnbiasedSelectImplementation<R> unbiasedSelectImplementation, a<? super R> aVar) {
        unbiasedSelectImplementation.shuffleAndRegisterClauses();
        return super.doSelect(aVar);
    }

    private final void shuffleAndRegisterClauses() {
        try {
            Collections.shuffle(this.clausesToRegister);
            Iterator<T> it = this.clausesToRegister.iterator();
            while (it.hasNext()) {
                SelectImplementation.register$default(this, (SelectImplementation.ClauseData) it.next(), false, 1, null);
            }
        } finally {
            this.clausesToRegister.clear();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    public Object doSelect(a<? super R> aVar) {
        return doSelect$suspendImpl((UnbiasedSelectImplementation) this, (a) aVar);
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, InterfaceC0646l<? super a<? super R>, ? extends Object> interfaceC0646l) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), interfaceC0646l, selectClause0.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, interfaceC0650p, selectClause1.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p10, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p10, interfaceC0650p, selectClause2.getOnCancellationConstructor()));
    }
}
