package dwo.gameserver.network.game.serverpackets;

public class Dice extends L2GameServerPacket
{
	private int _charObjId;
	private int _itemId;
	private int _number;
	private int _x;
	private int _y;
	private int _z;

	public Dice(int charObjId, int itemId, int number, int x, int y, int z)
	{
		_charObjId = charObjId;
		_itemId = itemId;
		_number = number;
		_x = x;
		_y = y;
		_z = z;
	}

	@Override
	protected void writeImpl()
	{
		writeD(_charObjId);  //object id of player
		writeD(_itemId);     //	item id of dice (spade)  4625,4626,4627,4628
		writeD(_number);      //number rolled
		writeD(_x);       //x
		writeD(_y);       //y
		writeD(_z);     //z
	}
}
