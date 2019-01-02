import { TestBed, inject } from '@angular/core/testing';

import { DoctorsRestAPIService } from './doctors-rest-api.service';

describe('DoctorsRestAPIService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DoctorsRestAPIService]
    });
  });

  it('should be created', inject([DoctorsRestAPIService], (service: DoctorsRestAPIService) => {
    expect(service).toBeTruthy();
  }));
});
