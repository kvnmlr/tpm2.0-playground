package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>
/**
* This structure holds the object or session context data. When saved, the full structure is encrypted.
*/
public class TPM2B_CONTEXT_SENSITIVE extends TpmStructure
{
    /**
    * This structure holds the object or session context data. When saved, the full structure is encrypted.
    * 
    * @param _buffer the sensitive data
    */
    public TPM2B_CONTEXT_SENSITIVE(byte[] _buffer)
    {
        buffer = _buffer;
    }
    /**
    * This structure holds the object or session context data. When saved, the full structure is encrypted.
    */
    public TPM2B_CONTEXT_SENSITIVE() {};
    // private short size;
    /**
    * the sensitive data
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
    public static TPM2B_CONTEXT_SENSITIVE fromTpm (byte[] x) 
    {
        TPM2B_CONTEXT_SENSITIVE ret = new TPM2B_CONTEXT_SENSITIVE();
        InByteBuf buf = new InByteBuf(x);
        ret.initFromTpm(buf);
        if (buf.bytesRemaining()!=0)
            throw new AssertionError("bytes remaining in buffer after object was de-serialized");
        return ret;
    }
    public static TPM2B_CONTEXT_SENSITIVE fromTpm (InByteBuf buf) 
    {
        TPM2B_CONTEXT_SENSITIVE ret = new TPM2B_CONTEXT_SENSITIVE();
        ret.initFromTpm(buf);
        return ret;
    }
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPM2B_CONTEXT_SENSITIVE");
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

