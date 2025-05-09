package com.sumsub.sns.internal.core.presentation.form.model;

import ca.InterfaceC0650p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f16580a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, InterfaceC0650p<Boolean, Boolean, Boolean>> f16581b = kotlin.collections.a.s(new Pair("&&", a.f16582a), new Pair("||", b.f16583a));

    public static final class a extends Lambda implements InterfaceC0650p<Boolean, Boolean, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16582a = new a();

        public a() {
            super(2);
        }

        public final Boolean a(boolean z10, boolean z11) {
            return Boolean.valueOf(z10 && z11);
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return a(bool.booleanValue(), bool2.booleanValue());
        }
    }

    public static final class b extends Lambda implements InterfaceC0650p<Boolean, Boolean, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16583a = new b();

        public b() {
            super(2);
        }

        public final Boolean a(boolean z10, boolean z11) {
            return Boolean.valueOf(z11 || z10);
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return a(bool.booleanValue(), bool2.booleanValue());
        }
    }

    public final Boolean a(Stack<Boolean> stack, InterfaceC0650p<? super Boolean, ? super Boolean, Boolean> interfaceC0650p) {
        return stack.push(interfaceC0650p.invoke(stack.pop(), stack.pop()));
    }

    public final int b(String str) {
        return kotlin.jvm.internal.f.b(str, "&&") ? 2 : 1;
    }

    public final boolean c(String str) {
        ArrayList<String> a10 = a(C0969n.u0(str).toString());
        if (a10.isEmpty()) {
            return false;
        }
        Stack<Boolean> stack = new Stack<>();
        Iterator<String> it = a10.iterator();
        while (it.hasNext()) {
            String next = it.next();
            InterfaceC0650p<Boolean, Boolean, Boolean> interfaceC0650p = this.f16581b.get(next);
            if (interfaceC0650p == null) {
                stack.push(Boolean.valueOf(Boolean.parseBoolean(next)));
            } else {
                if (stack.size() < this.f16580a) {
                    return true;
                }
                a(stack, interfaceC0650p);
            }
        }
        return stack.pop().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null && !C0969n.i0(str)) {
            Stack stack = new Stack();
            for (String str2 : C0969n.r0(str, new String[]{" "})) {
                if (this.f16581b.containsKey(str2)) {
                    while (!stack.isEmpty() && b((String) stack.peek()) >= b(str2)) {
                        arrayList.add(stack.pop());
                    }
                    stack.push(str2);
                } else if (kotlin.jvm.internal.f.b(str2, "(")) {
                    stack.push(str2);
                } else if (kotlin.jvm.internal.f.b(str2, ")")) {
                    while (!((String) stack.peek()).equals("(")) {
                        arrayList.add(stack.pop());
                    }
                    stack.pop();
                } else {
                    arrayList.add(str2);
                }
            }
            while (!stack.isEmpty()) {
                arrayList.add(stack.pop());
            }
        }
        return arrayList;
    }
}
