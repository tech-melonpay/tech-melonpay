package org.jmrtd.lds;

import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;

/* loaded from: classes3.dex */
public abstract class DisplayedImageDataGroup extends DataGroup {
    private static final int DISPLAYED_IMAGE_COUNT_TAG = 2;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 5994136177872308962L;
    private int displayedImageTagToUse;
    private List<DisplayedImageInfo> imageInfos;

    public DisplayedImageDataGroup(int i, List<DisplayedImageInfo> list, int i9) {
        super(i);
        if (list == null) {
            throw new IllegalArgumentException("imageInfos cannot be null");
        }
        this.displayedImageTagToUse = i9;
        this.imageInfos = new ArrayList(list);
        checkTypesConsistentWithTag();
    }

    private void add(DisplayedImageInfo displayedImageInfo) {
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList();
        }
        this.imageInfos.add(displayedImageInfo);
    }

    private void checkTypesConsistentWithTag() {
        for (DisplayedImageInfo displayedImageInfo : this.imageInfos) {
            if (displayedImageInfo == null) {
                throw new IllegalArgumentException("Found a null image info");
            }
            int type = displayedImageInfo.getType();
            if (type == 0) {
                if (this.displayedImageTagToUse != 24384) {
                    throw new IllegalArgumentException("'Signature or usual mark' image cannot be part of a 'Portrait' displayed image datagroup");
                }
            } else if (type != 1) {
                LOGGER.warning("Unsupported image type");
            } else if (this.displayedImageTagToUse != 24387) {
                throw new IllegalArgumentException("'Portrait' image cannot be part of a 'Signature or usual mark' displayed image datagroup");
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        List<DisplayedImageInfo> list = this.imageInfos;
        List<DisplayedImageInfo> list2 = ((DisplayedImageDataGroup) obj).imageInfos;
        return list == list2 || (list != null && list.equals(list2));
    }

    public List<DisplayedImageInfo> getImages() {
        return new ArrayList(this.imageInfos);
    }

    public int hashCode() {
        List<DisplayedImageInfo> list = this.imageInfos;
        return (list == null ? 1 : list.hashCode()) + 32674;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        if (readTag != 2) {
            throw new IllegalArgumentException(a.g(readTag, new StringBuilder("Expected tag 0x02 in displayed image structure, found ")));
        }
        if (tLVInputStream.readLength() != 1) {
            throw new IllegalArgumentException("DISPLAYED_IMAGE_COUNT should have length 1");
        }
        int i = tLVInputStream.readValue()[0] & 255;
        for (int i9 = 0; i9 < i; i9++) {
            DisplayedImageInfo displayedImageInfo = new DisplayedImageInfo(tLVInputStream);
            if (i9 == 0) {
                this.displayedImageTagToUse = displayedImageInfo.getDisplayedImageTag();
            } else if (displayedImageInfo.getDisplayedImageTag() != this.displayedImageTagToUse) {
                throw new IOException("Found images with different displayed image tags inside displayed image datagroup");
            }
            add(displayedImageInfo);
        }
    }

    @Override // org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" [");
        List<DisplayedImageInfo> list = this.imageInfos;
        if (list == null) {
            throw new IllegalStateException("imageInfos cannot be null");
        }
        boolean z10 = true;
        for (DisplayedImageInfo displayedImageInfo : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(displayedImageInfo.toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(2);
        tLVOutputStream.writeValue(new byte[]{(byte) this.imageInfos.size()});
        Iterator<DisplayedImageInfo> it = this.imageInfos.iterator();
        while (it.hasNext()) {
            it.next().writeObject(tLVOutputStream);
        }
    }

    public DisplayedImageDataGroup(int i, InputStream inputStream) {
        super(i, inputStream);
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList();
        }
        checkTypesConsistentWithTag();
    }
}
