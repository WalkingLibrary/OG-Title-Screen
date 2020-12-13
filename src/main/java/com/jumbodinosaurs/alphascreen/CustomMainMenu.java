package com.jumbodinosaurs.alphascreen;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class CustomMainMenu extends GuiMainMenu
{
    private LogoEffectRandomizer[][] logoEffects;
    private String[] minecraftLogo = {" *   * * *   * *** *** *** *** *** ***",
                                      " ** ** * **  * *   *   * * * * *    * ",
                                      " * * * * * * * **  *   **  *** **   * ",
                                      " *   * * *  ** *   *   * * * * *    * ",
                                      " *   * * *   * *** *** * * * * *    * "};
    
    private ResourceLocation terrain = new ResourceLocation("menu", "terrain.png");
    private ResourceLocation black = new ResourceLocation("menu", "black.png");
    
    public CustomMainMenu()
    {
        super();
    }
    
    
    @Override
    public void updateScreen()
    {
        if(logoEffects != null)
        {
            for(int i = 0; i < logoEffects.length; i++)
            {
                for(int j = 0; j < logoEffects[i].length; j++)
                {
                    logoEffects[i][j].updateBlockPos();
                }
            }
        }
        super.updateScreen();
    }
    
    
    
    
   
    
    public void superSkip(int mouseX, int mouseY, float partialTicks)
    {
        for(int i = 0; i < this.buttonList.size(); ++i)
        {
            this.buttonList.get(i).drawButton(this.mc, mouseX, mouseY, partialTicks);
        }
        
        for(int j = 0; j < this.labelList.size(); ++j)
        {
            this.labelList.get(j).drawLabel(this.mc, mouseX, mouseY);
        }
    }
    
   
   
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        drawDefaultBackground();
    
    
        drawLogo(partialTicks);
      
        OGMinecraftTessellator tessellator = OGMinecraftTessellator.instance;
       
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        tessellator.setColorOpaque_I(0xffffff);
        GL11.glPushMatrix();
        GL11.glTranslatef(width / 2 + 90, 70F, 0.0F);
        GL11.glRotatef(-20F, 0.0F, 0.0F, 1.0F);
        float f1 = 1.8F -
                   MathHelper.abs(MathHelper.sin(((float) (System.currentTimeMillis() % 1000L) / 1000F) *
                                                 3.141593F *
                                                 2.0F) * 0.1F);
        f1 = (f1 * 100F) / (float) (fontRenderer.getStringWidth(splashText) + 32);
        GL11.glScalef(f1, f1, f1);
        drawCenteredString(fontRenderer, splashText, 0, -8, 0xffff00);
        GL11.glPopMatrix();
        drawString(fontRenderer, "Minecraft 1.12.2", 2, 2, 0x505050);
        String s = "Copyright Mojang Specifications. Do not distribute.";
        drawString(fontRenderer, s, width - fontRenderer.getStringWidth(s) - 2, height - 10, 0xffffff);
        
        GlStateManager.blendFunc(0,0);
        this.superSkip(mouseX, mouseY, partialTicks);
        
    }
    
    private void drawLogo(float f)
    {
        if(logoEffects == null)
        {
            logoEffects = new LogoEffectRandomizer[minecraftLogo[0].length()][minecraftLogo.length];
            for(int i = 0; i < logoEffects.length; i++)
            {
                for(int j = 0; j < logoEffects[i].length; j++)
                {
                    logoEffects[i][j] = new LogoEffectRandomizer(this, i, j);
                }
                
            }
            
        }
        GL11.glMatrixMode(5889 /*GL_PROJECTION*/);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        ScaledResolution scaledresolution = new ScaledResolution(mc);
        int k = 120 * scaledresolution.getScaleFactor();
        GLU.gluPerspective(70F, (float) mc.displayWidth / (float) k, 0.05F, 100F);
        GL11.glViewport(0, mc.displayHeight - k, mc.displayWidth, k);
        GL11.glMatrixMode(5888 /*GL_MODELVIEW0_ARB*/);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glDisable(2884 /*GL_CULL_FACE*/);
        GL11.glCullFace(1029 /*GL_BACK*/);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        
        OGMinecraftRenderBlocks renderblocks = new OGMinecraftRenderBlocks();
        for(int l = 0; l < 3; l++)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.4F, 0.6F, -13F);
            if(l == 0)
            {
                GL11.glClear(256);
                GL11.glTranslatef(0.0F, -0.4F, 0.0F);
                GL11.glScalef(0.98F, 1.0F, 1.0F);
                GL11.glEnable(3042 /*GL_BLEND*/);
                GL11.glBlendFunc(770, 771);
            }
            if(l == 1)
            {
                GL11.glDisable(3042 /*GL_BLEND*/);
                GL11.glClear(256);
            }
            if(l == 2)
            {
                GL11.glEnable(3042 /*GL_BLEND*/);
                GL11.glBlendFunc(768, 1);
            }
            GL11.glScalef(-1.0F, 1F, -1.0F);
            GL11.glRotatef(15F, 1.0F, 0.0F, 0.0F);
            GL11.glScalef(-0.89F, -1.0F, -0.4F);
            GL11.glTranslatef((float) (-minecraftLogo[0].length()) * 0.5F,
                              (float) (-minecraftLogo.length) * 0.5F,
                              0.0F);
            
            mc.getTextureManager().bindTexture(terrain);
            if(l == 0)
            {
                mc.getTextureManager().bindTexture(black);
            }
            for(int i1 = 0; i1 < minecraftLogo.length; i1++)
            {
                for(int j1 = 0; j1 < minecraftLogo[i1].length(); j1++)
                {
                    char c = minecraftLogo[i1].charAt(j1);
                    if(c == ' ')
                    {
                        continue;
                    }
                    GL11.glPushMatrix();
                    LogoEffectRandomizer logoeffectrandomizer = logoEffects[j1][i1];
                    float f1 = (float) (logoeffectrandomizer.lastPos +
                                        (logoeffectrandomizer.currentPos - logoeffectrandomizer.lastPos) *
                                        (double) f);
                    float f2 = 1.0F;
                    float f3 = 1.0F;
                    float f4 = 0.0F;
                    if(l == 0)
                    {
                        f2 = f1 * 0.04F + 1.0F;
                        f3 = 1.0F / f2;
                        f1 = 0.0F;
                    }
                    GL11.glTranslatef(j1, i1, f1);
                    GL11.glScalef(f2, f2, f2);
                    GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
                    renderblocks.renderBlock(new AlphaBLock(1), f3);
                    GL11.glPopMatrix();
                }
                
            }
            
            GL11.glPopMatrix();
        }
        
        GL11.glDisable(3042 /*GL_BLEND*/);
        GL11.glMatrixMode(5889 /*GL_PROJECTION*/);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888 /*GL_MODELVIEW0_ARB*/);
        GL11.glPopMatrix();
        GL11.glViewport(0, 0, mc.displayWidth, mc.displayHeight);
        GL11.glEnable(2884 /*GL_CULL_FACE*/);
    }
}
