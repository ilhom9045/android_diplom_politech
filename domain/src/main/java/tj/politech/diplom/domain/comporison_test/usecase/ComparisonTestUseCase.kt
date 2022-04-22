package tj.politech.diplom.domain.comporison_test.usecase

import tj.politech.diplom.domain.comporison_test.entity.ComparisonTestEntity
import tj.politech.diplom.domain.comporison_test.repository.ComparisonTestRepository
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList

class ComparisonTestUseCase(private val comparisonTestRepository: ComparisonTestRepository) {
    fun execute(subjectId: Int, testCount: Int): GenericResponseArrayList<ComparisonTestEntity> {
        return comparisonTestRepository.getComparisonTests(
            subjectId = subjectId,
            testCount = testCount
        )
    }
}