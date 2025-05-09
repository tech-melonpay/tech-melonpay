package kotlinx.coroutines.selects;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012J\b\u0002\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R<\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\\\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R<\u0010\u0017\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause0Impl;", "Lkotlinx/coroutines/selects/SelectClause0;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "LO9/p;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lca/q;Lca/q;)V", "Ljava/lang/Object;", "getClauseObject", "()Ljava/lang/Object;", "Lca/q;", "getRegFunc", "()Lca/q;", "getOnCancellationConstructor", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "getProcessResFunc", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SelectClause0Impl implements SelectClause0 {
    private final Object clauseObject;
    private final InterfaceC0651q<SelectInstance<?>, Object, Object, InterfaceC0651q<Throwable, Object, d, p>> onCancellationConstructor;
    private final InterfaceC0651q<Object, Object, Object, Object> processResFunc;
    private final InterfaceC0651q<Object, SelectInstance<?>, Object, p> regFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause0Impl(Object obj, InterfaceC0651q<Object, ? super SelectInstance<?>, Object, p> interfaceC0651q, InterfaceC0651q<? super SelectInstance<?>, Object, Object, ? extends InterfaceC0651q<? super Throwable, Object, ? super d, p>> interfaceC0651q2) {
        InterfaceC0651q<Object, Object, Object, Object> interfaceC0651q3;
        this.clauseObject = obj;
        this.regFunc = interfaceC0651q;
        this.onCancellationConstructor = interfaceC0651q2;
        interfaceC0651q3 = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
        this.processResFunc = interfaceC0651q3;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public InterfaceC0651q<SelectInstance<?>, Object, Object, InterfaceC0651q<Throwable, Object, d, p>> getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public InterfaceC0651q<Object, Object, Object, Object> getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public InterfaceC0651q<Object, SelectInstance<?>, Object, p> getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ SelectClause0Impl(Object obj, InterfaceC0651q interfaceC0651q, InterfaceC0651q interfaceC0651q2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC0651q, (i & 4) != 0 ? null : interfaceC0651q2);
    }
}
