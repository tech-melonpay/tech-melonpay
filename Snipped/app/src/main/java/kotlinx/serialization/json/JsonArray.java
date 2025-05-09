package kotlinx.serialization.json;

import P9.s;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.InterfaceC0701a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.f;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import sa.C1246c;

/* compiled from: JsonElement.kt */
@InterfaceC1080d(with = C1246c.class)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001/B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010-\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010'¨\u00060"}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Lkotlinx/serialization/json/JsonElement;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Lkotlinx/serialization/json/JsonElement;", "indexOf", "(Lkotlinx/serialization/json/JsonElement;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSize", "size", "Companion", "a", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, InterfaceC0701a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final List<JsonElement> content;

    /* compiled from: JsonElement.kt */
    /* renamed from: kotlinx.serialization.json.JsonArray$a, reason: from kotlin metadata */
    public static final class Companion {
        public final InterfaceC1078b<JsonArray> serializer() {
            return C1246c.f27069a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> list) {
        super(null);
        this.content = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(JsonElement element) {
        return this.content.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return this.content.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        return f.b(this.content, other);
    }

    @Override // java.util.List
    public JsonElement get(int index) {
        return this.content.get(index);
    }

    public int getSize() {
        return this.content.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.content.hashCode();
    }

    public int indexOf(JsonElement element) {
        return this.content.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.content.iterator();
    }

    public int lastIndexOf(JsonElement element) {
        return this.content.lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator() {
        return this.content.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement set(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<JsonElement> subList(int fromIndex, int toIndex) {
        return this.content.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return c.a(this);
    }

    public String toString() {
        return s.P(this.content, ",", "[", "]", null, 56);
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof JsonElement) {
            return contains((JsonElement) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return indexOf((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return lastIndexOf((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator(int index) {
        return this.content.listIterator(index);
    }

    @Override // java.util.List
    /* renamed from: remove, reason: avoid collision after fix types in other method */
    public JsonElement remove2(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public JsonElement set2(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) c.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
