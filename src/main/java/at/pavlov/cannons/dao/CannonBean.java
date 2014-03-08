package at.pavlov.cannons.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.validation.Length;
import com.avaje.ebean.validation.NotEmpty;
import org.bukkit.block.BlockFace;

import java.util.UUID;


@Entity
@Table(name ="cannonlist_2_2")
public class CannonBean
{
	@Id
	private UUID id;

    @Length(max=20)
	private String name;

    @Length(max=20)
	private String owner;

	@NotEmpty
    @Length(max=20)
	private String world;

	private BlockFace cannonDirection;
	private int locX;
	private int locY;
	private int locZ;
    private int toClean;
	private int gunpowder;
	private int projectileID;
	private int projectileData;
    private boolean isProjectilePushed;
    private double cannonTemperature;
	private double horizontalAngle;
	private double verticalAngle;

    @Length(max=20)
	private String designId;
	private boolean Valid;
	
	
	
	public UUID getId()
	{
		return id;
	}
	public void setId(UUID id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getWorld()
	{
		return world;
	}
	public void setWorld(String world)
	{
		this.world = world;
	}
	public int getLocX()
	{
		return locX;
	}
	public void setLocX(int locX)
	{
		this.locX = locX;
	}
	public int getLocY()
	{
		return locY;
	}
	public void setLocY(int locY)
	{
		this.locY = locY;
	}
	public int getLocZ()
	{
		return locZ;
	}
	public void setLocZ(int locZ)
	{
		this.locZ = locZ;
	}
	public int getGunpowder()
	{
		return gunpowder;
	}
	public void setGunpowder(int gunpowder)
	{
		this.gunpowder = gunpowder;
	}
	public int getProjectileID()
	{
		return projectileID;
	}
	public void setProjectileID(int projectileID)
	{
		this.projectileID = projectileID;
	}
	public int getProjectileData()
	{
		return projectileData;
	}
	public void setProjectileData(int projectileData)
	{
		this.projectileData = projectileData;
	}
	public double getHorizontalAngle()
	{
		return horizontalAngle;
	}
	public void setHorizontalAngle(double horizontalAngle)
	{
		this.horizontalAngle = horizontalAngle;
	}

	public double getVerticalAngle()
	{
		return verticalAngle;
	}
	public void setVerticalAngle(double verticalAngle)
	{
		this.verticalAngle = verticalAngle;
	}
	public boolean isValid()
	{
		return Valid;
	}
	public void setValid(boolean valid)
	{
		Valid = valid;
	}
	public String getOwner()
	{
		return owner;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public BlockFace getCannonDirection()
	{
		return cannonDirection;
	}
	public void setCannonDirection(BlockFace cannonDirection)
	{
		this.cannonDirection = cannonDirection;
	}
	public String getDesignId()
	{
		return designId;
	}
	public void setDesignId(String designId)
	{
		this.designId = designId;
	}
    public double getCannonTemperature() {
        return cannonTemperature;
    }
    public void setCannonTemperature(double cannonTemperature) {
        this.cannonTemperature = cannonTemperature;
    }
    public int getToClean() {
        return toClean;
    }
    public void setToClean(int toClean) {
        this.toClean = toClean;
    }
    public boolean isProjectilePushed() {
        return isProjectilePushed;
    }
    public void setProjectilePushed(boolean projectilePushed) {
        isProjectilePushed = projectilePushed;
    }
}
