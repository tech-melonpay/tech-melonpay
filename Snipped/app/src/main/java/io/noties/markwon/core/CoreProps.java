package io.noties.markwon.core;

import U8.p;

/* loaded from: classes2.dex */
public abstract class CoreProps {

    /* renamed from: a, reason: collision with root package name */
    public static final p<ListItemType> f21669a = new p<>("list-item-type");

    /* renamed from: b, reason: collision with root package name */
    public static final p<Integer> f21670b = new p<>("bullet-list-item-level");

    /* renamed from: c, reason: collision with root package name */
    public static final p<Integer> f21671c = new p<>("ordered-list-item-number");

    /* renamed from: d, reason: collision with root package name */
    public static final p<Integer> f21672d = new p<>("heading-level");

    /* renamed from: e, reason: collision with root package name */
    public static final p<String> f21673e = new p<>("link-destination");

    /* renamed from: f, reason: collision with root package name */
    public static final p<Boolean> f21674f = new p<>("paragraph-is-in-tight-list");

    /* renamed from: g, reason: collision with root package name */
    public static final p<String> f21675g = new p<>("code-block-info");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ListItemType {

        /* renamed from: a, reason: collision with root package name */
        public static final ListItemType f21676a;

        /* renamed from: b, reason: collision with root package name */
        public static final ListItemType f21677b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ListItemType[] f21678c;

        static {
            ListItemType listItemType = new ListItemType("BULLET", 0);
            f21676a = listItemType;
            ListItemType listItemType2 = new ListItemType("ORDERED", 1);
            f21677b = listItemType2;
            f21678c = new ListItemType[]{listItemType, listItemType2};
        }

        public ListItemType() {
            throw null;
        }

        public static ListItemType valueOf(String str) {
            return (ListItemType) Enum.valueOf(ListItemType.class, str);
        }

        public static ListItemType[] values() {
            return (ListItemType[]) f21678c.clone();
        }
    }
}
