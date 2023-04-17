package solutions;

public class QueueProblem {
	public static int findNewIndex(char[] oldQueue, int currentIndex, char[]newQueue) {
		 char currentIndexMember = oldQueue[currentIndex];
		    int occurrencesBefore = countOccurrences(oldQueue, 0, currentIndex, currentIndexMember);
		    int newQueueIndex = findNthOccurrence(newQueue, currentIndexMember, occurrencesBefore + 1);
		    if (newQueueIndex == -1) {
		        int occurrencesAfter = countOccurrences(oldQueue, currentIndex + 1, oldQueue.length, currentIndexMember);
		        newQueueIndex = findNthOccurrence(newQueue, currentIndexMember, occurrencesAfter + 1);
		    }
		    return newQueueIndex+1;
	}
	public static int countOccurrences(char[] arr, int startIndex, int endIndex, char target) {
	    int count = 0;
	    for (int i = startIndex; i < endIndex; i++) {
	        if (arr[i] == target) {
	            count++;
	        }
	    }
	    return count;
	}

	public static int findNthOccurrence(char[] arr, char target, int n) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == target) {
	            count++;
	            if (count == n) {
	                return i;
	            }
	        }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		char [] oldQueue = {'A','B','C','D','E','F','A','B','C','D','A','B','C','A','B','A'};
		int currentIndex = 7;
		char[] newQueue = {'B','C','E','F','B','C','B','C','B'};
		
		int newIndex = findNewIndex(oldQueue, currentIndex, newQueue);
		System.out.println("New Index : "+newIndex);
	}

}
