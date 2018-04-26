package project;

public class MachineModel 
{
	private class CPU
	{
		private int accumulator;
		private int instructionPointer;
		private int memoryBase;
		
		public void incrementIP(int val)
		{
			instructionPointer += val;
		}
	}
}
