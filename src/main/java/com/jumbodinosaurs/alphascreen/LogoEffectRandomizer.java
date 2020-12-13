package com.jumbodinosaurs.alphascreen;

import net.minecraft.client.gui.GuiMainMenu;

import java.util.Random;

public class LogoEffectRandomizer
{
    public double currentPos;
    public double lastPos;
    public double yChange;
    
    public LogoEffectRandomizer(GuiMainMenu guimainmenu, int shift, int shiftX)
    {
        currentPos = lastPos = (double)(10 + shiftX) + new Random().nextDouble() * 32D + (double)shift;
    }
    
    public void updateBlockPos()
    {
        lastPos = currentPos;
        if(currentPos > 0.0D)
        {
            yChange -= 0.59999999999999998D;
        }
        currentPos += yChange;
        yChange *= 0.90000000000000002D;
        
        if(currentPos < 0.0D)
        {
            currentPos = 0.0D;
            yChange = 0.0D;
        }
       
    }
    
   
}
