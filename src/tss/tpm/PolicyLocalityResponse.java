package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>
/**
* This command indicates that the authorization will be limited to a specific locality.
*/
public class PolicyLocalityResponse extends TpmStructure
{
    /**
    * This command indicates that the authorization will be limited to a specific locality.
    */
    public PolicyLocalityResponse()
    {
    }
    @Override
    public void toTpm(OutByteBuf buf) 
    {
        return;
    }
    @Override
    public void initFromTpm(InByteBuf buf)
    {
    }
    @Override
    public byte[] toTpm() 
    {
        OutByteBuf buf = new OutByteBuf();
        toTpm(buf);
        return buf.getBuf();
    }
    public static PolicyLocalityResponse fromTpm (byte[] x) 
    {
        PolicyLocalityResponse ret = new PolicyLocalityResponse();
        InByteBuf buf = new InByteBuf(x);
        ret.initFromTpm(buf);
        if (buf.bytesRemaining()!=0)
            throw new AssertionError("bytes remaining in buffer after object was de-serialized");
        return ret;
    }
    public static PolicyLocalityResponse fromTpm (InByteBuf buf) 
    {
        PolicyLocalityResponse ret = new PolicyLocalityResponse();
        ret.initFromTpm(buf);
        return ret;
    }
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPM2_PolicyLocality_RESPONSE");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
    
    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
    };
    
    
};

//<<<

