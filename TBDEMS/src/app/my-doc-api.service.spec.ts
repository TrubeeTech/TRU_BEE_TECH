import { TestBed, inject } from '@angular/core/testing';

import { MyDocAPIService } from './my-doc-api.service';

describe('MyDocAPIService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MyDocAPIService]
    });
  });

  it('should be created', inject([MyDocAPIService], (service: MyDocAPIService) => {
    expect(service).toBeTruthy();
  }));
});
