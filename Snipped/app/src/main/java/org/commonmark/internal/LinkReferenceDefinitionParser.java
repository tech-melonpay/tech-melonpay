package org.commonmark.internal;

import Qa.o;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class LinkReferenceDefinitionParser {

    /* renamed from: d, reason: collision with root package name */
    public StringBuilder f25515d;

    /* renamed from: e, reason: collision with root package name */
    public String f25516e;

    /* renamed from: f, reason: collision with root package name */
    public String f25517f;

    /* renamed from: g, reason: collision with root package name */
    public char f25518g;

    /* renamed from: h, reason: collision with root package name */
    public StringBuilder f25519h;

    /* renamed from: a, reason: collision with root package name */
    public State f25512a = State.f25520a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f25513b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25514c = new ArrayList();
    public boolean i = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f25520a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f25521b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f25522c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f25523d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f25524e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f25525f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ State[] f25526g;

        static {
            State state = new State("START_DEFINITION", 0);
            f25520a = state;
            State state2 = new State("LABEL", 1);
            f25521b = state2;
            State state3 = new State("DESTINATION", 2);
            f25522c = state3;
            State state4 = new State("START_TITLE", 3);
            f25523d = state4;
            State state5 = new State("TITLE", 4);
            f25524e = state5;
            State state6 = new State("PARAGRAPH", 5);
            f25525f = state6;
            f25526g = new State[]{state, state2, state3, state4, state5, state6};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f25526g.clone();
        }
    }

    public final void a() {
        if (this.i) {
            String a10 = Pa.a.a(this.f25517f);
            StringBuilder sb2 = this.f25519h;
            String a11 = sb2 != null ? Pa.a.a(sb2.toString()) : null;
            ArrayList arrayList = this.f25514c;
            String str = this.f25516e;
            o oVar = new o();
            oVar.f3223f = str;
            oVar.f3224g = a10;
            oVar.f3225h = a11;
            arrayList.add(oVar);
            this.f25515d = null;
            this.i = false;
            this.f25516e = null;
            this.f25517f = null;
            this.f25519h = null;
        }
    }
}
