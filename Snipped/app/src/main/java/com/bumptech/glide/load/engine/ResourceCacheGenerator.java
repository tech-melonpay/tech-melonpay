package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class ResourceCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    private File cacheFile;
    private final DataFetcherGenerator.FetcherReadyCallback cb;
    private ResourceCacheKey currentKey;
    private final DecodeHelper<?> helper;
    private volatile ModelLoader.LoadData<?> loadData;
    private int modelLoaderIndex;
    private List<ModelLoader<File, ?>> modelLoaders;
    private int resourceClassIndex = -1;
    private int sourceIdIndex;
    private Key sourceKey;

    public ResourceCacheGenerator(DecodeHelper<?> decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.helper = decodeHelper;
        this.cb = fetcherReadyCallback;
    }

    private boolean hasNextModelLoader() {
        return this.modelLoaderIndex < this.modelLoaders.size();
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> loadData = this.loadData;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(Object obj) {
        this.cb.onDataFetcherReady(this.sourceKey, obj, this.loadData.fetcher, DataSource.RESOURCE_DISK_CACHE, this.currentKey);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(Exception exc) {
        this.cb.onDataFetcherFailed(this.currentKey, exc, this.loadData.fetcher, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
        GlideTrace.beginSection("ResourceCacheGenerator.startNext");
        try {
            List<Key> cacheKeys = this.helper.getCacheKeys();
            boolean z10 = false;
            if (cacheKeys.isEmpty()) {
                GlideTrace.endSection();
                return false;
            }
            List<Class<?>> registeredResourceClasses = this.helper.getRegisteredResourceClasses();
            if (registeredResourceClasses.isEmpty()) {
                if (File.class.equals(this.helper.getTranscodeClass())) {
                    GlideTrace.endSection();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.helper.getModelClass() + " to " + this.helper.getTranscodeClass());
            }
            while (true) {
                if (this.modelLoaders != null && hasNextModelLoader()) {
                    this.loadData = null;
                    while (!z10 && hasNextModelLoader()) {
                        List<ModelLoader<File, ?>> list = this.modelLoaders;
                        int i = this.modelLoaderIndex;
                        this.modelLoaderIndex = i + 1;
                        this.loadData = list.get(i).buildLoadData(this.cacheFile, this.helper.getWidth(), this.helper.getHeight(), this.helper.getOptions());
                        if (this.loadData != null && this.helper.hasLoadPath(this.loadData.fetcher.getDataClass())) {
                            this.loadData.fetcher.loadData(this.helper.getPriority(), this);
                            z10 = true;
                        }
                    }
                    GlideTrace.endSection();
                    return z10;
                }
                int i9 = this.resourceClassIndex + 1;
                this.resourceClassIndex = i9;
                if (i9 >= registeredResourceClasses.size()) {
                    int i10 = this.sourceIdIndex + 1;
                    this.sourceIdIndex = i10;
                    if (i10 >= cacheKeys.size()) {
                        GlideTrace.endSection();
                        return false;
                    }
                    this.resourceClassIndex = 0;
                }
                Key key = cacheKeys.get(this.sourceIdIndex);
                Class<?> cls = registeredResourceClasses.get(this.resourceClassIndex);
                this.currentKey = new ResourceCacheKey(this.helper.getArrayPool(), key, this.helper.getSignature(), this.helper.getWidth(), this.helper.getHeight(), this.helper.getTransformation(cls), cls, this.helper.getOptions());
                File file = this.helper.getDiskCache().get(this.currentKey);
                this.cacheFile = file;
                if (file != null) {
                    this.sourceKey = key;
                    this.modelLoaders = this.helper.getModelLoaders(file);
                    this.modelLoaderIndex = 0;
                }
            }
        } catch (Throwable th) {
            GlideTrace.endSection();
            throw th;
        }
    }
}
