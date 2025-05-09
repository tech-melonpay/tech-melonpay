package com.google.gson;

/* loaded from: classes.dex */
public interface ReflectionAccessFilter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FilterResult {

        /* renamed from: a, reason: collision with root package name */
        public static final FilterResult f10308a;

        /* renamed from: b, reason: collision with root package name */
        public static final FilterResult f10309b;

        /* renamed from: c, reason: collision with root package name */
        public static final FilterResult f10310c;

        /* renamed from: d, reason: collision with root package name */
        public static final FilterResult f10311d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ FilterResult[] f10312e;

        static {
            FilterResult filterResult = new FilterResult("ALLOW", 0);
            f10308a = filterResult;
            FilterResult filterResult2 = new FilterResult("INDECISIVE", 1);
            f10309b = filterResult2;
            FilterResult filterResult3 = new FilterResult("BLOCK_INACCESSIBLE", 2);
            f10310c = filterResult3;
            FilterResult filterResult4 = new FilterResult("BLOCK_ALL", 3);
            f10311d = filterResult4;
            f10312e = new FilterResult[]{filterResult, filterResult2, filterResult3, filterResult4};
        }

        public FilterResult() {
            throw null;
        }

        public static FilterResult valueOf(String str) {
            return (FilterResult) Enum.valueOf(FilterResult.class, str);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) f10312e.clone();
        }
    }

    FilterResult a();
}
