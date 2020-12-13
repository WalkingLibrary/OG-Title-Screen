package com.jumbodinosaurs.alphascreen;

public class AlphaBLock
{
    
    public int blockIndexInTexture;
    public double minX;
    public double minY;
    public double minZ;
    public double maxX = 1;
    public double maxY = 1;
    public double maxZ = 1;
    
    protected AlphaBLock(int blockIndexInTexture)
    {
        this.blockIndexInTexture = blockIndexInTexture;
    }
    
    
    public int getRenderType()
    {
        return 0;
    }
    
    
    public int getBlockTextureFromSide(int i)
    {
        return blockIndexInTexture;
    }
    
    
    public int getBlockIndexInTexture()
    {
        return blockIndexInTexture;
    }
    
    public void setBlockIndexInTexture(int blockIndexInTexture)
    {
        this.blockIndexInTexture = blockIndexInTexture;
    }
}
