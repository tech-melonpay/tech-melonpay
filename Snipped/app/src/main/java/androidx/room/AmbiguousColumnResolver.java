package androidx.room;

import C.v;
import O9.p;
import P9.i;
import P9.q;
import P9.s;
import P9.w;
import androidx.camera.core.n;
import androidx.room.AmbiguousColumnResolver;
import ca.InterfaceC0646l;
import ca.InterfaceC0651q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import ha.C0805d;
import ha.C0806e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0013\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J]\u0010\u001b\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00152\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00102\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00110\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "<init>", "()V", "", "", "resultColumns", "mappings", "", "resolve", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "", "Landroidx/room/AmbiguousColumnResolver$ResultColumn;", FirebaseAnalytics.Param.CONTENT, "pattern", "Lkotlin/Function3;", "", "LO9/p;", "onHashMatch", "rabinKarpSearch", "(Ljava/util/List;[Ljava/lang/String;Lca/q;)V", "T", "", "current", "depth", "Lkotlin/Function1;", "block", "dfs", "(Ljava/util/List;Ljava/util/List;ILca/l;)V", "Match", "ResultColumn", "Solution", "room-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "Lha/e;", "resultRange", "", "", "resultIndices", "<init>", "(Lha/e;Ljava/util/List;)V", "Lha/e;", "getResultRange", "()Lha/e;", "Ljava/util/List;", "getResultIndices", "()Ljava/util/List;", "room-common"}, k = 1, mv = {1, 8, 0})
    public static final class Match {
        private final List<Integer> resultIndices;
        private final C0806e resultRange;

        public Match(C0806e c0806e, List<Integer> list) {
            this.resultRange = c0806e;
            this.resultIndices = list;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final C0806e getResultRange() {
            return this.resultRange;
        }
    }

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/String;I)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String str, int i) {
            this.name = str;
            this.index = i;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i9 & 2) != 0) {
                i = resultColumn.index;
            }
            return resultColumn.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final ResultColumn copy(String name, int index) {
            return new ResultColumn(name, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) other;
            return kotlin.jvm.internal.f.b(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return Integer.hashCode(this.index) + (this.name.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ResultColumn(name=");
            sb2.append(this.name);
            sb2.append(", index=");
            return androidx.camera.core.impl.utils.a.m(sb2, this.index, ')');
        }
    }

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "coverageOffset", "", "overlaps", "(Ljava/util/List;II)V", "getCoverageOffset", "()I", "getMatches", "()Ljava/util/List;", "getOverlaps", "compareTo", "other", "Companion", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Solution implements Comparable<Solution> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(EmptyList.f23104a, Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        /* compiled from: AmbiguousColumnResolver.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "()V", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;", "build", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final Solution build(List<Match> matches) {
                List<Match> list = matches;
                int i = 0;
                int i9 = 0;
                for (Match match : list) {
                    i9 += ((match.getResultRange().f21227b - match.getResultRange().f21226a) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = ((Match) it.next()).getResultRange().f21226a;
                while (it.hasNext()) {
                    int i11 = ((Match) it.next()).getResultRange().f21226a;
                    if (i10 > i11) {
                        i10 = i11;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = ((Match) it2.next()).getResultRange().f21227b;
                while (it2.hasNext()) {
                    int i13 = ((Match) it2.next()).getResultRange().f21227b;
                    if (i12 < i13) {
                        i12 = i13;
                    }
                }
                Iterable c0806e = new C0806e(i10, i12, 1);
                if (!(c0806e instanceof Collection) || !((Collection) c0806e).isEmpty()) {
                    Iterator<Integer> it3 = c0806e.iterator();
                    int i14 = 0;
                    while (((C0805d) it3).f21231c) {
                        int a10 = ((w) it3).a();
                        Iterator<T> it4 = list.iterator();
                        int i15 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                C0806e resultRange = ((Match) it4.next()).getResultRange();
                                if (resultRange.f21226a <= a10 && a10 <= resultRange.f21227b) {
                                    i15++;
                                }
                                if (i15 > 1) {
                                    i14++;
                                    if (i14 < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                            }
                        }
                    }
                    i = i14;
                }
                return new Solution(matches, i9, i);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Solution(List<Match> list, int i, int i9) {
            this.matches = list;
            this.coverageOffset = i;
            this.overlaps = i9;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            int c2 = kotlin.jvm.internal.f.c(this.overlaps, other.overlaps);
            return c2 != 0 ? c2 : kotlin.jvm.internal.f.c(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> content, List<T> current, int depth, InterfaceC0646l<? super List<? extends T>, p> block) {
        if (depth == content.size()) {
            block.invoke(s.c0(current));
            return;
        }
        Iterator<T> it = content.get(depth).iterator();
        while (it.hasNext()) {
            current.add(it.next());
            INSTANCE.dfs(content, current, depth + 1, block);
            q.B(current);
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, InterfaceC0646l interfaceC0646l, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i9 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i, interfaceC0646l);
    }

    private final void rabinKarpSearch(List<ResultColumn> content, String[] pattern, InterfaceC0651q<? super Integer, ? super Integer, ? super List<ResultColumn>, p> onHashMatch) {
        int i = 0;
        int i9 = 0;
        for (String str : pattern) {
            i9 += str.hashCode();
        }
        int length = pattern.length;
        Iterator<T> it = content.subList(0, length).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (i9 == i10) {
                onHashMatch.invoke(Integer.valueOf(i), Integer.valueOf(length), content.subList(i, length));
            }
            int i11 = i + 1;
            int i12 = length + 1;
            if (i12 > content.size()) {
                return;
            }
            i10 = (i10 - content.get(i).getName().hashCode()) + content.get(length).getName().hashCode();
            i = i11;
            length = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        int length = resultColumns.length;
        int i = 0;
        for (int i9 = 0; i9 < length; i9++) {
            String str = resultColumns[i9];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = v.j(1, 1, str);
            }
            resultColumns[i9] = str.toLowerCase(Locale.US);
        }
        int length2 = mappings.length;
        for (int i10 = 0; i10 < length2; i10++) {
            int length3 = mappings[i10].length;
            for (int i11 = 0; i11 < length3; i11++) {
                String[] strArr = mappings[i10];
                strArr[i11] = strArr[i11].toLowerCase(Locale.US);
            }
        }
        SetBuilder setBuilder = new SetBuilder();
        for (String[] strArr2 : mappings) {
            q.w(setBuilder, strArr2);
        }
        SetBuilder b9 = i.b(setBuilder);
        ListBuilder j10 = i.j();
        int length4 = resultColumns.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length4) {
            String str2 = resultColumns[i12];
            int i14 = i13 + 1;
            if (b9.f23148a.containsKey(str2)) {
                j10.add(new ResultColumn(str2, i13));
            }
            i12++;
            i13 = i14;
        }
        ListBuilder a10 = i.a(j10);
        int length5 = mappings.length;
        final ArrayList arrayList = new ArrayList(length5);
        for (int i15 = 0; i15 < length5; i15++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i16 = 0;
        final int i17 = 0;
        while (i16 < length6) {
            final String[] strArr3 = mappings[i16];
            int i18 = i17 + 1;
            INSTANCE.rabinKarpSearch(a10, strArr3, new InterfaceC0651q<Integer, Integer, List<? extends ResultColumn>, p>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // ca.InterfaceC0651q
                public /* bridge */ /* synthetic */ p invoke(Integer num, Integer num2, List<? extends AmbiguousColumnResolver.ResultColumn> list) {
                    invoke(num.intValue(), num2.intValue(), (List<AmbiguousColumnResolver.ResultColumn>) list);
                    return p.f3034a;
                }

                public final void invoke(int i19, int i20, List<AmbiguousColumnResolver.ResultColumn> list) {
                    Object obj;
                    String[] strArr4 = strArr3;
                    ArrayList arrayList2 = new ArrayList(strArr4.length);
                    for (String str3 : strArr4) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (kotlin.jvm.internal.f.b(str3, ((AmbiguousColumnResolver.ResultColumn) obj).getName())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) obj;
                        if (resultColumn == null) {
                            return;
                        }
                        arrayList2.add(Integer.valueOf(resultColumn.getIndex()));
                    }
                    arrayList.get(i17).add(new AmbiguousColumnResolver.Match(new C0806e(i19, i20 - 1, 1), arrayList2));
                }
            });
            if (((List) arrayList.get(i17)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                int i19 = i;
                while (i19 < length7) {
                    String str3 = strArr3[i19];
                    ListBuilder j11 = i.j();
                    ListIterator listIterator = a10.listIterator(i);
                    while (true) {
                        ListBuilder.a aVar = (ListBuilder.a) listIterator;
                        if (!aVar.hasNext()) {
                            break;
                        }
                        ResultColumn resultColumn = (ResultColumn) aVar.next();
                        if (kotlin.jvm.internal.f.b(str3, resultColumn.getName())) {
                            j11.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    ListBuilder a11 = i.a(j11);
                    if (!(!a11.isEmpty())) {
                        throw new IllegalStateException(n.a("Column ", str3, " not found in result").toString());
                    }
                    arrayList2.add(a11);
                    i19++;
                    i = 0;
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new InterfaceC0646l<List<? extends Integer>, p>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public /* bridge */ /* synthetic */ p invoke(List<? extends Integer> list) {
                        invoke2((List<Integer>) list);
                        return p.f3034a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<Integer> list) {
                        List<Integer> list2 = list;
                        Iterator<T> it = list2.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int intValue = ((Number) it.next()).intValue();
                        while (it.hasNext()) {
                            int intValue2 = ((Number) it.next()).intValue();
                            if (intValue > intValue2) {
                                intValue = intValue2;
                            }
                        }
                        Iterator<T> it2 = list2.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int intValue3 = ((Number) it2.next()).intValue();
                        while (it2.hasNext()) {
                            int intValue4 = ((Number) it2.next()).intValue();
                            if (intValue3 < intValue4) {
                                intValue3 = intValue4;
                            }
                        }
                        arrayList.get(i17).add(new AmbiguousColumnResolver.Match(new C0806e(intValue, intValue3, 1), list));
                    }
                }, 6, null);
            }
            i16++;
            i17 = i18;
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(!((List) it.next()).isEmpty())) {
                    throw new IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23179a = Solution.INSTANCE.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new InterfaceC0646l<List<? extends Match>, p>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ p invoke(List<? extends AmbiguousColumnResolver.Match> list) {
                invoke2((List<AmbiguousColumnResolver.Match>) list);
                return p.f3034a;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<AmbiguousColumnResolver.Match> list) {
                ?? build = AmbiguousColumnResolver.Solution.INSTANCE.build(list);
                if (build.compareTo(ref$ObjectRef.f23179a) < 0) {
                    ref$ObjectRef.f23179a = build;
                }
            }
        }, 6, null);
        List<Match> matches = ((Solution) ref$ObjectRef.f23179a).getMatches();
        ArrayList arrayList3 = new ArrayList(P9.n.u(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(s.b0(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }
}
