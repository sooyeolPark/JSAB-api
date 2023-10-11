package fishing.jsab.api.test.service;

import java.util.List;
import java.util.stream.Collectors;

import fishing.jsab.api.test.dto.TestDto;
import fishing.jsab.api.test.repository.TestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TestService {

    private final TestRepository testRepository;

    public List<TestDto.TestResponse> getTests() {
        List<TestDto.TestResponse> res = testRepository.findAll()
                .stream()
                .map(TestDto.TestResponse::of)
                .collect(Collectors.toList());
        return res;
    }
}