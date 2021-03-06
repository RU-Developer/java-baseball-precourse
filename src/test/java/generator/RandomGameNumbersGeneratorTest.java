package generator;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("숫자 생성기로 컴퓨터의 정답 숫자를 생성한다")
class RandomGameNumbersGeneratorTest {

	@Test
	@DisplayName("랜덤 숫자 생성기로 3개의 수가 생성되는지 확인")
	void getRandomGameNumbers() {
		GameNumbersGenerator gameNumbersGenerator = new RandomGameNumbersGenerator();
		List<Integer> generatedNumbers = gameNumbersGenerator.getGeneratedNumbers();
		assertThat(generatedNumbers.size()).isEqualTo(3);
	}

	@Test
	@DisplayName("커스텀 숫자 생성기로 3개의 수가 생성되는지 확인")
	void getCustomGameNumbers() {
		GameNumbersGenerator gameNumbersGenerator = new CustomGameNumbersGenerator(Arrays.asList(1, 3, 5));
		List<Integer> generatedNumbers = gameNumbersGenerator.getGeneratedNumbers();
		assertThat(generatedNumbers.size()).isEqualTo(3);
		assertThat(generatedNumbers).contains(1, 3, 5);
	}

}