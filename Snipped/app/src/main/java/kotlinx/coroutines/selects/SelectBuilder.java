package kotlinx.coroutines.selects;

import T9.a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J2\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\b\u0010\rJX\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\b\u0010\u0011JR\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002¢\u0006\u0004\b\b\u0010\u0012J5\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilder;", "R", "", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "LT9/a;", "block", "LO9/p;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lca/l;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lca/p;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lca/p;)V", "(Lkotlinx/coroutines/selects/SelectClause2;Lca/p;)V", "", "timeMillis", "onTimeout", "(JLca/l;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface SelectBuilder<R> {

    /* compiled from: Select.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void invoke(SelectBuilder<? super R> selectBuilder, SelectClause2<? super P, ? extends Q> selectClause2, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p) {
            selectBuilder.invoke(selectClause2, null, interfaceC0650p);
        }

        @ExperimentalCoroutinesApi
        public static <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j10, InterfaceC0646l<? super a<? super R>, ? extends Object> interfaceC0646l) {
            OnTimeoutKt.onTimeout(selectBuilder, j10, interfaceC0646l);
        }
    }

    void invoke(SelectClause0 selectClause0, InterfaceC0646l<? super a<? super R>, ? extends Object> interfaceC0646l);

    <Q> void invoke(SelectClause1<? extends Q> selectClause1, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p10, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p);

    @ExperimentalCoroutinesApi
    void onTimeout(long timeMillis, InterfaceC0646l<? super a<? super R>, ? extends Object> block);
}
