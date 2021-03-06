package superlord.prehistoricfauna.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import superlord.prehistoricfauna.PrehistoricFauna;
import superlord.prehistoricfauna.entity.BasilemysEntity;
import superlord.prehistoricfauna.entity.model.Basilemys;
import superlord.prehistoricfauna.entity.model.BasilemysHiding;

public class BasilemysRenderer extends MobRenderer<BasilemysEntity,  EntityModel<BasilemysEntity>> {

	private static final ResourceLocation BASILEMYS = new ResourceLocation(PrehistoricFauna.MODID, "textures/entities/basilemys.png");
	private static final Basilemys BASILEMYS_MODEL = new Basilemys();
	private static final BasilemysHiding BASILEMYS_HIDING_MODEL = new BasilemysHiding();
	
	public BasilemysRenderer() {
		super(Minecraft.getInstance().getRenderManager(), BASILEMYS_MODEL, 0.75F);
	}
	
	public void render(BasilemysEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
    	if (entityIn.isPanicing()) {
    		entityModel = BASILEMYS_HIDING_MODEL;
    	} else {
            entityModel = BASILEMYS_MODEL;
        }
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }
	
	 protected void preRenderCallback(BasilemysEntity entity, MatrixStack matrixStackIn, float partialTickTime) {
		 if(entity.isChild()) {
			 matrixStackIn.scale(0.5F, 0.5F, 0.5F);
		 }
	 }
	
	@Override
	public ResourceLocation getEntityTexture(BasilemysEntity entity) {
		return BASILEMYS;
	}
	
}
