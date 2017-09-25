package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>
/**
* This sized buffer is used to embed a TPMT_TEMPLATE for TPM2_CreateLoaded().
*/
public class TPM2B_TEMPLATE extends TpmStructure
{
    /**
    * This sized buffer is used to embed a TPMT_TEMPLATE for TPM2_CreateLoaded().
    * 
    * @param _buffer the public area
    */
    public TPM2B_TEMPLATE(byte[] _buffer)
    {
        buffer = _buffer;
    }
    /**
    * This sized buffer is used to embed a TPMT_TEMPLATE for TPM2_CreateLoaded().
    */
    public TPM2B_TEMPLATE() {};
    /**
    * size of publicArea
    */
    // private short size;
    /**
    * the public area
    */
    public byte[] buffer;
    @Override
    public void toTpm(OutByteBuf buf) 
    {
        buf.writeInt((buffer!=null)?buffer.length:0, 2);
        buf.write(buffer);
        return;
    }
    @Override
    public void initFromTpm(InByteBuf buf)
    {
        int _size = buf.readInt(2);
        buffer = new byte[_size];
        buf.readArrayOfInts(buffer, 1, _size);
    }
    @Override
    public byte[] toTpm() 
    {
        OutByteBuf buf = new OutByteBuf();
        toTpm(buf);
        return buf.getBuf();
    }
    public static TPM2B_TEMPLATE fromTpm (byte[] x) 
    {
        TPM2B_TEMPLATE ret = new TPM2B_TEMPLATE();
        InByteBuf buf = new InByteBuf(x);
        ret.initFromTpm(buf);
        if (buf.bytesRemaining()!=0)
            throw new AssertionError("bytes remaining in buffer after object was de-serialized");
        return ret;
    }
    public static TPM2B_TEMPLATE fromTpm (InByteBuf buf) 
    {
        TPM2B_TEMPLATE ret = new TPM2B_TEMPLATE();
        ret.initFromTpm(buf);
        return ret;
    }
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPM2B_TEMPLATE");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
    
    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
        _p.add(d, "byte", "buffer", buffer);
    };
    
    
};

//<<<

